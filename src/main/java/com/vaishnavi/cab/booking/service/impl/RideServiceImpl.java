package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.repository.RideRepository;
import com.vaishnavi.cab.booking.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService {

    @Autowired
    private RideRepository rideRepo;

    @Override
    public boolean addRide(Ride ride) {
        return rideRepo.store(ride);
    }

    @Override
    public List<Ride> getAllRides() throws Exception {
        return rideRepo.retrieve();
    }

    @Override
    public Ride getRideById(int id) throws Exception {
        return rideRepo.search(id);
    }

    @Override
    public boolean removeRide(int id) throws Exception {
        return rideRepo.delete(id);
    }
}


