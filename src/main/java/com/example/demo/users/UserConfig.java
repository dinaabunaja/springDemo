package com.example.demo.users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner (UserRepository repository){
        return args -> {
           Users dina= new Users(
                    "Dina",
                    "dhufgd",
                    "dina.abunaja@gmail.com",
                    "Amman-Jordan",
                    266372883,
                    LocalDate.of(2000,2,3),
                    20

            );
            Users dddd= new Users(
                    "Didd",
                    "dhufgd",
                    "didfdna.abunaja@gmail.com",
                    "Amman-Jordan",
                    266372883,
                    LocalDate.of(2000,2,3),
                    20

            );
            repository.saveAll(
                    List.of(dina,dddd)
            );

        };
    }
}
