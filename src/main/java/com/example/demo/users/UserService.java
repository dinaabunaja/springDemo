package com.example.demo.users;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {
    public List<Users> getUser(){
        return List.of(
                new Users(
                        "dina_abunaja",
                        "122345ffdgg",
                        "ffdhh@fggf.com",
                        "fgghdddfg",
                        23445543,
                        LocalDate.of(2000,5,3),
                        15

                )

        );
    }
}
