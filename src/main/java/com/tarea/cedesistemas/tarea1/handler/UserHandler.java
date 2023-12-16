package com.tarea.cedesistemas.tarea1.handler;

import com.tarea.cedesistemas.tarea1.dto.UserDTO;
import com.tarea.cedesistemas.tarea1.model.Book;
import com.tarea.cedesistemas.tarea1.model.User;
import com.tarea.cedesistemas.tarea1.repository.BookRepository;
import com.tarea.cedesistemas.tarea1.repository.UserRepository;
import com.tarea.cedesistemas.tarea1.util.validation.Validation;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class UserHandler {

    Validation validation;
    UserRepository userRepository;

    public Mono<ServerResponse> create(ServerRequest request){
        return validation.validate(UserDTO.class, request)
                .map(userDTO -> new User(null,userDTO.documentType(),userDTO.documentNumber(), userDTO.name(), userDTO.lastname(), userDTO.email()))
                .flatMap(userRepository::save)
                .flatMap(user -> ServerResponse.ok().body(BodyInserters.fromValue(user)));
    }

    public Mono<ServerResponse> getById(ServerRequest request){
        Integer id = Integer.parseInt(request.pathVariable("id"));
        return userRepository.findById(id)
                .flatMap(user -> ServerResponse.ok().body(BodyInserters.fromValue(user)))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> getAll(ServerRequest request){
        return userRepository.findAll()
                .collectList()
                .flatMap(users -> ServerResponse.ok().body(BodyInserters.fromValue(users)))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> delete(ServerRequest request){
        Integer id = Integer.parseInt(request.pathVariable("id"));
        return userRepository.deleteById(id)
                .then(ServerResponse.ok().build());
    }

    public Mono<ServerResponse> update(ServerRequest request){
        return validation.validate(UserDTO.class, request)
                .map(userDTO -> new User(userDTO.userId(),userDTO.documentType(),userDTO.documentNumber(), userDTO.name(), userDTO.lastname(), userDTO.email()))
                .flatMap(userRepository::save)
                .flatMap(user -> ServerResponse.ok().body(BodyInserters.fromValue(user)));
    }
}
