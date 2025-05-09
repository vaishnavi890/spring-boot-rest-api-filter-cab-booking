package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.repository.RatingRepository;
import com.vaishnavi.cab.booking.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepo;

    @Override
    public boolean rateDriver(Rating rating) {
        return ratingRepo.store(rating);
    }

    @Override
    public List<Rating> getAllRatings() throws Exception {
        return ratingRepo.retrieve();
    }

    @Override
    public Rating getRatingById(int id) throws Exception {
        return ratingRepo.search(id);
    }

    @Override
    public boolean deleteRating(int id) throws Exception {
        return ratingRepo.delete(id);
    }
}



