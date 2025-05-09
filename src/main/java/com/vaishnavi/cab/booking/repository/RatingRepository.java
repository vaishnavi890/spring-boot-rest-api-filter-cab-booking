package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Rating;
import java.util.List;

public interface RatingRepository {
    boolean store(Rating rating);
    List<Rating> retrieve() throws Exception;
    Rating search(int id) throws Exception;
    boolean delete(int id) throws Exception;
}


