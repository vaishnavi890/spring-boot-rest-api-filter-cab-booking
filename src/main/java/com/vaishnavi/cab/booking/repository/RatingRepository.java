package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Rating;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RatingRepository implements EntityRepository<Rating> {
    private static final Logger logger = LoggerFactory.getLogger(RatingRepository.class);
    private final List<Rating> ratingList = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean store(Rating rating) {
        logger.info("Inside RatingRepository.store()");
        rating.setRatingId(++index);
        ratingList.add(index, rating);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        logger.info("Inside RatingRepository.delete()");
        ratingList.remove(id);
        return true;
    }

    @Override
    public List<Rating> retrieve() throws Exception {
        logger.info("Inside RatingRepository.retrieve()");
        return ratingList;
    }

    @Override
    public Rating search(int id) throws Exception {
        logger.info("Inside RatingRepository.search()");
        return ratingList.get(id);
    }
}


