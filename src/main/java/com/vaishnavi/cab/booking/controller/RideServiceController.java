package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.service.RideService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RideServiceController {

    private static final Logger logger = LoggerFactory.getLogger(RideServiceController.class);

    @Autowired
    private RideService service;

    @GetMapping("/rides")
    public ResponseEntity<List<Ride>> getRides() {
        logger.info("GET /rides called");
        return new ResponseEntity<>(service.retrieveRides(), HttpStatus.OK);
    }

    @PostMapping("/rides")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addRide(@RequestBody Ride ride) {
        logger.info("POST /rides called");
        return new ResponseEntity<>(service.storeRide(ride) ? "Ride added" : "Ride not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/rides/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteRide(@PathVariable int id) {
        logger.info("DELETE /rides/" + id);
        return new ResponseEntity<>(service.deleteRide(id) ? "Ride deleted" : "Ride not deleted", HttpStatus.OK);
    }

    @GetMapping("/rides/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Ride> getRideById(@PathVariable int id) {
        logger.info("GET /rides/" + id);
        return new ResponseEntity<>(service.searchRide(id), HttpStatus.OK);
    }
}



