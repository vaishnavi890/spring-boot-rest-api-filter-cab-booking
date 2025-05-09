package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Ride;
import java.util.List;

public interface RideService {
    boolean addRide(Ride ride);
    List<Ride> getAllRides() throws Exception;
    Ride getRideById(int id) throws Exception;
    boolean removeRide(int id) throws Exception;
}


