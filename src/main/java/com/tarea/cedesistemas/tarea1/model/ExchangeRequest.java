package com.tarea.cedesistemas.tarea1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
import java.util.UUID;

@Data
@AllArgsConstructor
@Table("exchange_request")
public class ExchangeRequest {
    private UUID exchangeId;
    private String state;
    private UUID user;
    private UUID book;
}
