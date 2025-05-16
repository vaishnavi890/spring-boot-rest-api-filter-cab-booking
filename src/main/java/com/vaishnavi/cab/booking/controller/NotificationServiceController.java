package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Notification;
import com.vaishnavi.cab.booking.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotificationServiceController {

    private static final Logger logger = LoggerFactory.getLogger(NotificationServiceController.class);

    @Autowired
    private NotificationService service;

    @GetMapping("/notifications")
    public ResponseEntity<List<Notification>> getNotifications() {
        logger.info("GET /notifications called");
        return new ResponseEntity<>(service.retrieveNotifications(), HttpStatus.OK);
    }

    @PostMapping("/notifications")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addNotification(@RequestBody Notification notification) {
        logger.info("POST /notifications called");
        return new ResponseEntity<>(service.storeNotification(notification) ? "Notification added" : "Notification not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/notifications/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteNotification(@PathVariable int id) {
        logger.info("DELETE /notifications/" + id);
        return new ResponseEntity<>(service.deleteNotification(id) ? "Notification deleted" : "Notification not deleted", HttpStatus.OK);
    }

    @GetMapping("/notifications/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Notification> getNotificationById(@PathVariable int id) {
        logger.info("GET /notifications/" + id);
        return new ResponseEntity<>(service.searchNotification(id), HttpStatus.OK);
    }
}


