package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.RideRequest;
import java.util.List;

public interface RideRequestService {
    List<RideRequest> getAllRequests() throws Exception;
    boolean addRequest(RideRequest request);
    boolean deleteRequest(int id);
    RideRequest findRequest(int id) throws Exception;

    List<RideRequest> retrieveRideRequests();

    boolean storeRideRequest(RideRequest rideRequest);

    boolean deleteRideRequest(int id);

    RideRequest searchRideRequest(int id);
}


