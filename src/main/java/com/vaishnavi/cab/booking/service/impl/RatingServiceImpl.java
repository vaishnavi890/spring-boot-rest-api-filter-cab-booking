package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.repository.RatingRepository;
import com.vaishnavi.cab.booking.service.RatingService;
import com.vaishnavi.cab.booking.exceptions.RatingNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoRatingsFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    private static final Logger logger = LoggerFactory.getLogger(RatingServiceImpl.class);

    @Autowired
    private RatingRepository repo;

    public List<Rating> getAllRatings() throws Exception {
        logger.info("Inside RatingServiceImpl.getAllRatings()");
        List<Rating> list = repo.retrieve();
        if (list.isEmpty()) throw new NoRatingsFoundException();
        return list;
    }

    public boolean addRating(Rating rating) {
        logger.info("Inside RatingServiceImpl.addRating()");
        return repo.store(rating);
    }

    public boolean deleteRating(int id) {
        logger.info("Inside RatingServiceImpl.deleteRating()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new RatingNotFoundException();
        }
        return true;
    }

    public Rating findRating(int id) throws Exception {
        logger.info("Inside RatingServiceImpl.findRating()");
        Rating rating = repo.search(id);
        if (rating == null) throw new RatingNotFoundException();
        return rating;
    }

    @Override
    public List<Rating> retrieveRatings() {
        return List.of();
    }

    @Override
    public boolean storeRating(Rating rating) {
        return false;
    }

    @Override
    public Rating searchRating(int id) {
        return null;
    }
}


