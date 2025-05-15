package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Ride;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RideRepository implements EntityRepository<Ride> {
    private static final Logger logger = LoggerFactory.getLogger(RideRepository.class);
    private final List<Ride> rideList = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean store(Ride ride) {
        logger.info("Inside RideRepository.store()");
        ride.setRideId(++index);
        rideList.add(index, ride);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        logger.info("Inside RideRepository.delete()");
        rideList.remove(id);
        return true;
    }

    @Override
    public List<Ride> retrieve() throws Exception {
        logger.info("Inside RideRepository.retrieve()");
        return rideList;
    }

    @Override
    public Ride search(int id) throws Exception {
        logger.info("Inside RideRepository.search()");
        return rideList.get(id);
    }
}



