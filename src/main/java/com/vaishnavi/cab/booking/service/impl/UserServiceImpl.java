package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.repository.UserRepository;
import com.vaishnavi.cab.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void createUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public void removeUser(int id) {
        userRepository.deleteUser(id);
    }
}


