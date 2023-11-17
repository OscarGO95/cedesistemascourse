package com.tarea.cedesistemas.tarea1.repository;

import com.tarea.cedesistemas.tarea1.model.ExchangeRequest;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import java.util.UUID;

public interface ExchangeRepository extends R2dbcRepository<ExchangeRequest, UUID> {
}
