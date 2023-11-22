package com.tarea.cedesistemas.tarea1.repository;

import com.tarea.cedesistemas.tarea1.model.Review;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import java.util.UUID;

public interface ReviewRepository extends R2dbcRepository<Review, Integer> {
}
