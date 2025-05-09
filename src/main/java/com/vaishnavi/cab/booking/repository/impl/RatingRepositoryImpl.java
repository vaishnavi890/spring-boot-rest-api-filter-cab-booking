package com.vaishnavi.cab.booking.repository.impl;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.repository.RatingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RatingRepositoryImpl implements RatingRepository {
    private static final Logger logger = LoggerFactory.getLogger(RatingRepositoryImpl.class);
    private final List<Rating> ratingList = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean store(Rating rating) {
        logger.info("Inside RatingRepository.store()");
        rating.setId((long) ++index);
        ratingList.add(rating);
        return true;
    }

    @Override
    public List<Rating> retrieve() {
        logger.info("Inside RatingRepository.retrieve()");
        return ratingList;
    }

    @Override
    public Rating search(int id) {
        logger.info("Inside RatingRepository.search()");
        return ratingList.get(id);
    }

    @Override
    public boolean delete(int id) {
        logger.info("Inside RatingRepository.delete()");
        ratingList.remove(id);
        return true;
    }
}


