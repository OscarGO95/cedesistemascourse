package com.tarea.cedesistemas.tarea1.handler;

import com.tarea.cedesistemas.tarea1.util.validation.Validation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class ReviewHandler {

    Validation validation;

    public Mono<ServerResponse> create(ServerRequest request){
        return null;
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
