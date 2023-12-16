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
public class ExchangeRequest implements Something {
    @Id
    private Integer exchangeId;
    private String state;
    @MappedCollection(idColumn = "userId")
    private Integer userId;
    private Integer bookId;

    @Override
    public String doSomething() {
        return this.state + " - " + userId;
    }
}
