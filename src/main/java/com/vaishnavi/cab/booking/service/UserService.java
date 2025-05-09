package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.User;
import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(int id);
    void createUser(User user);
    void removeUser(int id);
}


