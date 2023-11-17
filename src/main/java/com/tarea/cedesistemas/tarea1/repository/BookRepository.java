package com.tarea.cedesistemas.tarea1.repository;

import com.tarea.cedesistemas.tarea1.model.Book;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import java.util.UUID;

public interface BookRepository extends R2dbcRepository<Book, UUID> {
}
