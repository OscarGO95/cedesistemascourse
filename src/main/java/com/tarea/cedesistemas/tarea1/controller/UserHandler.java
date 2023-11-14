package com.tarea.cedesistemas.tarea1.controller;

import com.tarea.cedesistemas.tarea1.dto.UserDTO;
import com.tarea.cedesistemas.tarea1.util.validation.Validation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class UserHandler {

    Validation<UserDTO> validation;

    public Mono<ServerResponse> test(ServerRequest request){
        return validation.validate(UserDTO.class, request)
                .map(userDTO -> {
                    System.out.println("asdasdsa");
                    return userDTO;
                })
                .flatMap(userDTO -> ServerResponse.ok().build());

    }


}
