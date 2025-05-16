package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Cab;
import com.vaishnavi.cab.booking.service.CabService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CabServiceController {

    private static final Logger logger = LoggerFactory.getLogger(CabServiceController.class);

    @Autowired
    private CabService service;

    @GetMapping("/cabs")
    public ResponseEntity<List<Cab>> getCabs() {
        logger.info("GET /cabs called");
        return new ResponseEntity<>(service.retrieveCabs(), HttpStatus.OK);
    }

    @PostMapping("/cabs")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addCab(@RequestBody Cab cab) {
        logger.info("POST /cabs called");
        return new ResponseEntity<>(service.storeCab(cab) ? "Cab added" : "Cab not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/cabs/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteCab(@PathVariable int id) {
        logger.info("DELETE /cabs/" + id);
        return new ResponseEntity<>(service.deleteCab(id) ? "Cab deleted" : "Cab not deleted", HttpStatus.OK);
    }

    @GetMapping("/cabs/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Cab> getCabById(@PathVariable int id) {
        logger.info("GET /cabs/" + id);
        return new ResponseEntity<>(service.searchCab(id), HttpStatus.OK);
    }
}



