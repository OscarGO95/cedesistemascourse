package com.tarea.cedesistemas.tarea1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@AllArgsConstructor
@Table("review")
public class Review implements Something{
    @Id
    private Integer reviewId;
    private String text;
    private Double score;
    @MappedCollection(idColumn = "userId")

    @Override
    public String doSomething() {
        return this.text + " - " +this.text;
    }
}
