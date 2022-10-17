package com.example.jusantestbot.Service;

import com.example.jusantestbot.Repository.UserRepository;

import com.example.jusantestbot.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long userId){
        return userRepository.findById(userId).orElse(null);
    }

}
