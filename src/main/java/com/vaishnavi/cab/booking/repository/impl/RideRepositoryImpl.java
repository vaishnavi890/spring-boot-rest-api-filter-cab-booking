package com.vaishnavi.cab.booking.repository.impl;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.repository.RideRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RideRepositoryImpl implements RideRepository {
    private static final Logger logger = LoggerFactory.getLogger(RideRepositoryImpl.class);
    private final List<Ride> rideList = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean store(Ride ride) {
        logger.info("Inside RideRepository.store()");
        ride.setId((long) ++index);
        rideList.add(ride);
        return true;
    }

    @Override
    public List<Ride> retrieve() {
        logger.info("Inside RideRepository.retrieve()");
        return rideList;
    }

    @Override
    public Ride search(int id) {
        logger.info("Inside RideRepository.search()");
        return rideList.get(id);
    }

    @Override
    public boolean delete(int id) {
        logger.info("Inside RideRepository.delete()");
        rideList.remove(id);
        return true;
    }
}
