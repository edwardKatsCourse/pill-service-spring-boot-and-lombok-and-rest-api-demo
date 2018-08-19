package com.telran.ps.service;

import com.telran.ps.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getById(Long id);
    User save(User user);
}
