package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.User;
import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void deleteUser(int id);
}


