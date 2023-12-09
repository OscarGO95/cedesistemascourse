package com.tarea.cedesistemas.tarea1.dto;

import jakarta.validation.constraints.*;

public record UserDTO(
        @NotNull
        Integer userId,
        @NotNull
        @NotBlank
        String documentType,
        @NotNull
        @Min(5)
        Long documentNumber,
        @NotNull
        @NotBlank
        String name,
        @NotNull
        @NotBlank
        String lastname,
        @NotNull
        @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "The email doesn't comply with a valid format")
        String email
){}