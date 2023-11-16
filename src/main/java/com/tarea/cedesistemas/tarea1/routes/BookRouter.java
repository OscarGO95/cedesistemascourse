package com.tarea.cedesistemas.tarea1.routes;

import com.tarea.cedesistemas.tarea1.handler.BookHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class BookRouter {

    @Bean
    public RouterFunction<ServerResponse> routerFunctionBook(BookHandler handler) {
        return route(POST("/book"), handler::create)
                .andRoute(GET("/book"),handler::getAll)
                .andRoute(GET("/book/{id}"),handler::getById)
                .andRoute(PUT("/book"),handler::update)
                .andRoute(DELETE("/book/{id}"),handler::delete);
    }
}
