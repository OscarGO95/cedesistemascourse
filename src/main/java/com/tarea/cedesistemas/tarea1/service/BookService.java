package com.tarea.cedesistemas.tarea1.service;

import com.tarea.cedesistemas.tarea1.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;
}
