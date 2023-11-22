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
@Table("exchange_request")
public class ExchangeRequest {
    @Id
    private Integer exchangeId;
    private String state;
    @MappedCollection(idColumn = "userId")
    @Column("USER_ID")
    private User user;
    @MappedCollection(idColumn = "bookId")
    private Book book;
}
