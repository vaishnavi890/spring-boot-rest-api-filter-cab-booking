package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Location;
import com.vaishnavi.cab.booking.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationServiceController {

    private static final Logger logger = LoggerFactory.getLogger(LocationServiceController.class);

    @Autowired
    private LocationService service;

    @GetMapping("/locations")
    public ResponseEntity<List<Location>> getLocations() {
        logger.info("GET /locations called");
        return new ResponseEntity<>(service.retrieveLocations(), HttpStatus.OK);
    }

    @PostMapping("/locations")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addLocation(@RequestBody Location location) {
        logger.info("POST /locations called");
        return new ResponseEntity<>(service.storeLocation(location) ? "Location added" : "Location not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/locations/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteLocation(@PathVariable int id) {
        logger.info("DELETE /locations/" + id);
        return new ResponseEntity<>(service.deleteLocation(id) ? "Location deleted" : "Location not deleted", HttpStatus.OK);
    }

    @GetMapping("/locations/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Location> getLocationById(@PathVariable int id) {
        logger.info("GET /locations/" + id);
        return new ResponseEntity<>(service.searchLocation(id), HttpStatus.OK);
    }
}



