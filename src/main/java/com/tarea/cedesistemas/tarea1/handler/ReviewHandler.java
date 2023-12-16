package com.tarea.cedesistemas.tarea1.handler;

import com.tarea.cedesistemas.tarea1.repository.ReviewRepository;
import com.tarea.cedesistemas.tarea1.util.validation.Validation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class ReviewHandler {

    ReviewRepository reviewRepository;

    public Mono<ServerResponse> getById(ServerRequest request){
        Integer id = Integer.parseInt(request.pathVariable("id"));
        return reviewRepository.findById(id)
                .flatMap(review -> ServerResponse.ok().body(BodyInserters.fromValue(review)))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> getAll(ServerRequest request){
        return reviewRepository.findAll()
                .collectList()
                .flatMap(reviews -> ServerResponse.ok().body(BodyInserters.fromValue(reviews)))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

}
