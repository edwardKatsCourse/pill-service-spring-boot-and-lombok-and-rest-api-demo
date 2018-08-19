package com.telran.ps.service.impl;

import com.telran.ps.model.User;
import com.telran.ps.repository.UserRepository;
import com.telran.ps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        //save -> id == null
        //update -> id != null
        return userRepository.save(user);
    }
}
