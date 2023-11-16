package com.tarea.cedesistemas.tarea1.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record BookDTO(
    @Pattern(regexp = "^[0-9a-fA-F]{8}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{12}$")
    String bookId,
    @NotNull
    String title,
    @NotNull
    String author,
    @NotNull
    String genre,
    @NotNull
    @Pattern(regexp = "^(A|U/B)$", message = "State should be 'B', 'U' or 'A'")
    String state,
    @Pattern(regexp = "^[0-9a-fA-F]{8}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{12}$")
    String user
) { }
