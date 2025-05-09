package com.vaishnavi.cab.booking.repository.impl;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepositoryImpl() {
        users.add(new User(1, "Alice", "alice@example.com", "1234567890"));
        users.add(new User(2, "Bob", "bob@example.com", "9876543210"));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        return users.stream().filter(u -> u.getUserId() == id).findFirst().orElse(null);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(u -> u.getUserId() == id);
    }
}


