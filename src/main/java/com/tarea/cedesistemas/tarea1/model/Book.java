package com.tarea.cedesistemas.tarea1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("book")
public class Book implements Serializable,Something {
    @Id
    private Integer bookId;
    private String title;
    private String author;
    private String genre;
    private String state;
    private Integer userId;

    @Override
    public String doSomething() {
        return this.title + " - " + this.author + " - " + this.genre;
    }
}
