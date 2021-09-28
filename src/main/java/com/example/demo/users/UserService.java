package com.example.demo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> listAll(){
        return userRepository.findAll();
    }

    public void save(Users user){
        userRepository.save(user);
    }

    public Users get(Integer id){
        return userRepository.findById(id).get();
    }

    public void delete(Integer id){
        boolean exists = userRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException(
                    "User with id "
                    + id+ " not exists!");
        }
        userRepository.deleteById(id);


    }


}
