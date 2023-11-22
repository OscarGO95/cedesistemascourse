package com.tarea.cedesistemas.tarea1.handler;

import com.tarea.cedesistemas.tarea1.dto.UserDTO;
import com.tarea.cedesistemas.tarea1.model.Book;
import com.tarea.cedesistemas.tarea1.model.User;
import com.tarea.cedesistemas.tarea1.repository.BookRepository;
import com.tarea.cedesistemas.tarea1.repository.UserRepository;
import com.tarea.cedesistemas.tarea1.util.validation.Validation;
import lombok.AllArgsConstructor;
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
    BookRepository bookRepository;

    public Mono<ServerResponse> create(ServerRequest request){
        return validation.validate(UserDTO.class,request)
                .map(userDTO -> bookRepository.findAll())
                .flatMap(d->ServerResponse.ok().body(BodyInserters.fromPublisher(d, Book.class)));


        /*return validation.validate(UserDTO.class, request)
                .map(userDTO -> new User(null,userDTO.documentType(),userDTO.documentNumber(), userDTO.name(), userDTO.lastname(), userDTO.email()))
                .flatMap(userRepository::save)
                .flatMap(userDTO -> ServerResponse.ok().build());*/
    }

    public Mono<ServerResponse> getById(ServerRequest request){
        String id = request.pathVariable("id");
        return null;
    }

    public Mono<ServerResponse> getAll(ServerRequest request){
        return null;
    }

    public Mono<ServerResponse> delete(ServerRequest request){
        return null;
    }

    public Mono<ServerResponse> update(ServerRequest request){
        return null;
    }
}
