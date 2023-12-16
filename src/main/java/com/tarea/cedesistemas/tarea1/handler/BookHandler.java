package com.tarea.cedesistemas.tarea1.handler;

import com.tarea.cedesistemas.tarea1.repository.BookRepository;
import com.tarea.cedesistemas.tarea1.util.validation.Validation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class BookHandler {

    BookRepository bookRepository;

    public Mono<ServerResponse> getById(ServerRequest request){
        Integer id = Integer.parseInt(request.pathVariable("id"));
        return bookRepository.findById(id)
                .flatMap(book -> ServerResponse.ok().body(BodyInserters.fromValue(book)))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> getAll(ServerRequest request){
        return bookRepository.findAll()
                .collectList()
                .flatMap(books -> ServerResponse.ok().body(BodyInserters.fromValue(books)))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

}
