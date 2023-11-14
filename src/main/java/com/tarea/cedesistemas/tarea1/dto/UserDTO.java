package com.tarea.cedesistemas.tarea1.dto;

import jakarta.validation.constraints.*;

public record UserDTO(
        @NotNull
        @NotBlank
        String documentType,
        @NotNull
        @Min(5)
        Integer documentNumber,
        @NotNull
        @NotBlank
        String name,
        @NotNull
        @NotBlank
        String lastname,
        @NotNull
        @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "The email doesn't comply with a valid format")
        String email,
        @NotNull
        @Pattern(regexp = "^(S|P)$", message = "Role should be 'S' o 'P'")
        String role
){}