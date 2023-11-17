package com.tarea.cedesistemas.tarea1.service;

import com.tarea.cedesistemas.tarea1.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewService {

    private ReviewRepository reviewRepository;
}
