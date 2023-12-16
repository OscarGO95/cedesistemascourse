package com.tarea.cedesistemas.tarea1.handler;

import com.tarea.cedesistemas.tarea1.repository.ExchangeRepository;
import com.tarea.cedesistemas.tarea1.util.validation.Validation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class ExchangeHandler {

    ExchangeRepository exchangeRepository;

    public Mono<ServerResponse> getById(ServerRequest request){
        Integer id = Integer.parseInt(request.pathVariable("id"));
        return exchangeRepository.findById(id)
                .flatMap(exchange -> ServerResponse.ok().body(BodyInserters.fromValue(exchange)))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> getAll(ServerRequest request){
        return exchangeRepository.findAll()
                .collectList()
                .flatMap(exchanges -> ServerResponse.ok().body(BodyInserters.fromValue(exchanges)))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

}
