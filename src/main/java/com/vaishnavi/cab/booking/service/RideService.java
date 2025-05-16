package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Ride;
import java.util.List;

public interface RideService {
    List<Ride> getAllRides() throws Exception;
    boolean addRide(Ride ride);
    boolean deleteRide(int id);
    Ride findRide(int id) throws Exception;

    List<Ride> retrieveRides();

    boolean storeRide(Ride ride);

    Ride searchRide(int id);
}

