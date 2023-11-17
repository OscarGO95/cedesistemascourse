package com.tarea.cedesistemas.tarea1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@AllArgsConstructor
@Table("review")
public class Review {
    private UUID reviewId;
    private String text;
    private Double score;
    private UUID user;
    private UUID book;
}
