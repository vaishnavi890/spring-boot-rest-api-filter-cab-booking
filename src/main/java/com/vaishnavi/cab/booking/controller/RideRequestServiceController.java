package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.RideRequest;
import com.vaishnavi.cab.booking.service.RideRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RideRequestServiceController {

    private static final Logger logger = LoggerFactory.getLogger(RideRequestServiceController.class);

    @Autowired
    private RideRequestService service;

    @GetMapping("/riderequests")
    public ResponseEntity<List<RideRequest>> getRideRequests() {
        logger.info("GET /riderequests called");
        return new ResponseEntity<>(service.retrieveRideRequests(), HttpStatus.OK);
    }

    @PostMapping("/riderequests")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addRideRequest(@RequestBody RideRequest rideRequest) {
        logger.info("POST /riderequests called");
        return new ResponseEntity<>(service.storeRideRequest(rideRequest) ? "RideRequest added" : "RideRequest not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/riderequests/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteRideRequest(@PathVariable int id) {
        logger.info("DELETE /riderequests/" + id);
        return new ResponseEntity<>(service.deleteRideRequest(id) ? "RideRequest deleted" : "RideRequest not deleted", HttpStatus.OK);
    }

    @GetMapping("/riderequests/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<RideRequest> getRideRequestById(@PathVariable int id) {
        logger.info("GET /riderequests/" + id);
        return new ResponseEntity<>(service.searchRideRequest(id), HttpStatus.OK);
    }
}



