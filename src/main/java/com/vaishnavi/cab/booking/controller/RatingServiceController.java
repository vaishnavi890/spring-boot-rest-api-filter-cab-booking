package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.service.RatingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingServiceController {

    private static final Logger logger = LoggerFactory.getLogger(RatingServiceController.class);

    @Autowired
    private RatingService service;

    @GetMapping("/ratings")
    public ResponseEntity<List<Rating>> getRatings() {
        logger.info("GET /ratings called");
        return new ResponseEntity<>(service.retrieveRatings(), HttpStatus.OK);
    }

    @PostMapping("/ratings")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addRating(@RequestBody Rating rating) {
        logger.info("POST /ratings called");
        return new ResponseEntity<>(service.storeRating(rating) ? "Rating added" : "Rating not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/ratings/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteRating(@PathVariable int id) {
        logger.info("DELETE /ratings/" + id);
        return new ResponseEntity<>(service.deleteRating(id) ? "Rating deleted" : "Rating not deleted", HttpStatus.OK);
    }

    @GetMapping("/ratings/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Rating> getRatingById(@PathVariable int id) {
        logger.info("GET /ratings/" + id);
        return new ResponseEntity<>(service.searchRating(id), HttpStatus.OK);
    }
}


