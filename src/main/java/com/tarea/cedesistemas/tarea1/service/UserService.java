package com.tarea.cedesistemas.tarea1.service;

import com.tarea.cedesistemas.tarea1.model.User;
import com.tarea.cedesistemas.tarea1.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    UserRepository userRepository;

    public Mono<User> findById(Integer id){
        return userRepository.findById(id);
    }

}
