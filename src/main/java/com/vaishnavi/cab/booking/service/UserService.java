package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers() throws Exception;
    boolean addUser(User user);
    boolean deleteUser(int id);
    User findUser(int id) throws Exception;

    List<User> retrieveUser();

    boolean storeUser(User user);

    User searchUser(int id);
}

