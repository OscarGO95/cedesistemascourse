package com.tarea.cedesistemas.tarea1.routes;

import com.tarea.cedesistemas.tarea1.handler.ExchangeHandler;
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
public class ExchangeRouter {

    @Bean
    public RouterFunction<ServerResponse> routerFunctionExchange(ExchangeHandler handler) {
        return route(POST("/exchange"), handler::create)
                .andRoute(GET("/exchange"),handler::getAll)
                .andRoute(GET("/exchange/{id}"),handler::getById)
                .andRoute(PUT("/exchange"),handler::update)
                .andRoute(DELETE("/exchange/{id}"),handler::delete);
    }
}
