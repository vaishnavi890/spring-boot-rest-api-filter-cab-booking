package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.service.DriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverServiceController {

    private static final Logger logger = LoggerFactory.getLogger(DriverServiceController.class);

    @Autowired
    private DriverService service;

    @GetMapping("/drivers")
    public ResponseEntity<List<Driver>> getDrivers() {
        logger.info("GET /drivers called");
        return new ResponseEntity<>(service.retrieveDrivers(), HttpStatus.OK);
    }

    @PostMapping("/drivers")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addDriver(@RequestBody Driver driver) {
        logger.info("POST /drivers called");
        return new ResponseEntity<>(service.storeDriver(driver) ? "Driver added" : "Driver not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/drivers/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteDriver(@PathVariable int id) {
        logger.info("DELETE /drivers/" + id);
        return new ResponseEntity<>(service.deleteDriver(id) ? "Driver deleted" : "Driver not deleted", HttpStatus.OK);
    }

    @GetMapping("/drivers/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Driver> getDriverById(@PathVariable int id) {
        logger.info("GET /drivers/" + id);
        return new ResponseEntity<>(service.searchDriver(id), HttpStatus.OK);
    }
}


