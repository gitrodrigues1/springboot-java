package com.example.marcos.course.services;

import com.example.marcos.course.entities.User;
import com.example.marcos.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> optionaluser =  userRepository.findById(id);
        return optionaluser.get();
    }
}
