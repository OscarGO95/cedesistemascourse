package com.tarea.cedesistemas.tarea1.service;

import com.tarea.cedesistemas.tarea1.repository.ExchangeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExchangeService {

    private ExchangeRepository  exchangeRepository;
}
