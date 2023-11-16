package com.tarea.cedesistemas.tarea1.repository;

import com.tarea.cedesistemas.tarea1.model.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface UserRepository extends R2dbcRepository<User, UUID> {
}
