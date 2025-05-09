package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public String rateDriver(@RequestBody Rating rating) {
        ratingService.rateDriver(rating);
        return "Driver rated successfully!";
    }

    @GetMapping
    public List<Rating> getAllRatings() throws Exception {
        return ratingService.getAllRatings();
    }

    @GetMapping("/{id}")
    public Rating getRating(@PathVariable int id) throws Exception {
        return ratingService.getRatingById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteRating(@PathVariable int id) throws Exception {
        ratingService.deleteRating(id);
        return "Rating removed successfully.";
    }
}



