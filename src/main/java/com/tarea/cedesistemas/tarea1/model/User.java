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
@Table("users")
public class User implements Serializable {
    @Id
    private Integer userId;
    private String documentType;
    private Long documentNumber;
    private String name;
    private String lastname;
    private String email;
    /*@Transient
    @OneToMany(targetEntity = Book.class)
    @JoinColumn(name = "USER_ID")
    private List<Book> books = new ArrayList<>();*/
}
