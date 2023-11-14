package com.tarea.cedesistemas.tarea1.util.validation;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class Validation <T>{

    Validator validator;

    public Mono<T> validate(Class<T> clazz, ServerRequest request){
        return request.bodyToMono(clazz)
                .switchIfEmpty(Mono.empty())
                .flatMap(body -> {
                    Errors errors = new BeanPropertyBindingResult(body, clazz.getName());
                    this.validator.validate(body, errors);
                    if (!errors.hasErrors()){
                        return Mono.just(body);
                    } else {
                        return Mono.error(new ResponseStatusException(HttpStatus.BAD_REQUEST, errors.getFieldErrors().toString()));
                    }
                }).doOnSuccess(serverResponse -> {
                    if (serverResponse == null){
                        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No Body");
                    }
                });
    }

}
