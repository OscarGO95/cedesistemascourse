package com.tarea.cedesistemas.tarea1.routes;

import com.tarea.cedesistemas.tarea1.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class UserRouter {

    @Bean
    public RouterFunction<ServerResponse> routerFunctionUser(UserHandler handler) {
        return route(POST("/user"), handler::create)
                .andRoute(GET("/user"),handler::getAll)
                .andRoute(GET("/user/{id}"),handler::getById)
                .andRoute(PUT("/user"),handler::update)
                .andRoute(DELETE("/user/{id}"),handler::delete);
    }
}
