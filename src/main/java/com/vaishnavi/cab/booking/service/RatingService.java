package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Rating;
import java.util.List;

public interface RatingService {
    boolean rateDriver(Rating rating);
    List<Rating> getAllRatings() throws Exception;
    Rating getRatingById(int id) throws Exception;
    boolean deleteRating(int id) throws Exception;
}


