package com.tarea.cedesistemas.tarea1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
import java.util.UUID;

@Data
@AllArgsConstructor
@Table("book")
public class Book {
    private UUID bookId;
    private String title;
    private String author;
    private String genre;
    private String state;
    private UUID user;
}
