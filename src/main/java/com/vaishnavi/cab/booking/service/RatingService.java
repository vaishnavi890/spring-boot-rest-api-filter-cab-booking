package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Rating;
import java.util.List;

public interface RatingService {
    List<Rating> getAllRatings() throws Exception;
    boolean addRating(Rating rating);
    boolean deleteRating(int id);
    Rating findRating(int id) throws Exception;
}


