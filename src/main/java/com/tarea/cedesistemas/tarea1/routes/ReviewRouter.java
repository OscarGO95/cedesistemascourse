package com.tarea.cedesistemas.tarea1.routes;

import com.tarea.cedesistemas.tarea1.handler.ReviewHandler;
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
public class ReviewRouter {

    @Bean
    public RouterFunction<ServerResponse> routerFunctionReview(ReviewHandler handler) {
        return route(POST("/review"), handler::create)
                .andRoute(GET("/review"),handler::getAll)
                .andRoute(GET("/review/{id}"),handler::getById)
                .andRoute(PUT("/review"),handler::update)
                .andRoute(DELETE("/review/{id}"),handler::delete);
    }
}
