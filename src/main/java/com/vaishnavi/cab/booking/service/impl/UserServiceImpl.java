package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.repository.UserRepository;
import com.vaishnavi.cab.booking.service.UserService;
import com.vaishnavi.cab.booking.exceptions.UserNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoUsersFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository repo;

    @Override
    public List<User> getAllUsers() throws Exception {
        logger.info("Inside UserServiceImpl.getAllUsers()");
        List<User> list = repo.retrieve();
        if (list.isEmpty()) throw new NoUsersFoundException();
        return list;
    }

    @Override
    public boolean addUser(User user) {
        logger.info("Inside UserServiceImpl.addUser()");
        return repo.store(user);
    }

    @Override
    public boolean deleteUser(int id) {
        logger.info("Inside UserServiceImpl.deleteUser()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new UserNotFoundException();
        }
        return true;
    }

    @Override
    public User findUser(int id) throws Exception {
        logger.info("Inside UserServiceImpl.findUser()");
        User user = repo.search(id);
        if (user == null) throw new UserNotFoundException();
        return user;
    }

    @Override
    public List<User> retrieveUser() {
        return List.of();
    }

    @Override
    public boolean storeUser(User user) {
        return false;
    }

    @Override
    public User searchUser(int id) {
        return null;
    }
}

