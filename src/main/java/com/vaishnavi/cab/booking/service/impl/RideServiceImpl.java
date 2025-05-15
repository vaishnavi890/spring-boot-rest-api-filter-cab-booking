package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.repository.RideRepository;
import com.vaishnavi.cab.booking.service.RideService;
import com.vaishnavi.cab.booking.exceptions.RideNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoRidesFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService {

    private static final Logger logger = LoggerFactory.getLogger(RideServiceImpl.class);

    @Autowired
    private RideRepository repo;

    public List<Ride> getAllRides() throws Exception {
        logger.info("Inside RideServiceImpl.getAllRides()");
        List<Ride> list = repo.retrieve();
        if (list.isEmpty()) throw new NoRidesFoundException();
        return list;
    }

    public boolean addRide(Ride ride) {
        logger.info("Inside RideServiceImpl.addRide()");
        return repo.store(ride);
    }

    public boolean deleteRide(int id) {
        logger.info("Inside RideServiceImpl.deleteRide()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new RideNotFoundException();
        }
        return true;
    }

    public Ride findRide(int id) throws Exception {
        logger.info("Inside RideServiceImpl.findRide()");
        Ride ride = repo.search(id);
        if (ride == null) throw new RideNotFoundException();
        return ride;
    }
}

