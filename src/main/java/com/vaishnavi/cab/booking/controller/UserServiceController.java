package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserServiceController {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceController.class);

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        logger.info("GET /users called");
        return new ResponseEntity<>(service.retrieveUser(), HttpStatus.OK);
    }

    @PostMapping("/users")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        logger.info("POST /users called");
        return new ResponseEntity<>(service.storeUser(user) ? "User added" : "User not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/users/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        logger.info("DELETE /users/" + id);
        return new ResponseEntity<>(service.deleteUser(id) ? "User deleted" : "User not deleted", HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        logger.info("GET /users/" + id);
        return new ResponseEntity<>(service.searchUser(id), HttpStatus.OK);
    }
}



