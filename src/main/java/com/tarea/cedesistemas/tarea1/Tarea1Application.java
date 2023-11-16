package com.tarea.cedesistemas.tarea1;

import com.tarea.cedesistemas.tarea1.model.User;
import com.tarea.cedesistemas.tarea1.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.Duration;
import java.util.Arrays;
import java.util.UUID;

@SpringBootApplication
public class Tarea1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tarea1Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {

        return (args) -> {
            repository.saveAll(Arrays.asList(
                    new User(UUID.randomUUID(),"CC",1000000000L,"Pepito1","Perez","pepito1@correo.com"),
                    new User(UUID.randomUUID(),"CC",1000043400L,"Pepito2","Perez","pepito2@correo.com"),
                    new User(UUID.randomUUID(),"CC",1000002300L,"Pepito3","Perez","pepito3@correo.com"),
                    new User(UUID.randomUUID(),"CC",1000035400L,"Pepito4","Perez","pepito4@correo.com"),
                    new User(UUID.randomUUID(),"CC",1000340000L,"Pepito5","Perez","pepito5@correo.com"),
                    new User(UUID.randomUUID(),"CC",1000032000L,"Pepito6","Perez","pepito6@correo.com"),
                    new User(UUID.randomUUID(),"CC",1000354000L,"Pepito7","Perez","pepito7@correo.com"),
                    new User(UUID.randomUUID(),"CC",1000768000L,"Pepito8","Perez","pepito8@correo.com"),
                    new User(UUID.randomUUID(),"CC",1004409800L,"Pepito9","Perez","pepito9@correo.com"),
                    new User(UUID.randomUUID(),"CC",1023974500L,"Pepito10","Perez","pepito10@correo.com")
            )).subscribe();
        };
    }
}
