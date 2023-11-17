package com.tarea.cedesistemas.tarea1.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@AllArgsConstructor
@Table("users")
public class User {
    private UUID userId;
    private String documentType;
    private Long documentNumber;
    private String name;
    private String lastname;
    private String email;
}
