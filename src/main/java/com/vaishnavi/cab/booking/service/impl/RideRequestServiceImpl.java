package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.RideRequest;
import com.vaishnavi.cab.booking.repository.RideRequestRepository;
import com.vaishnavi.cab.booking.service.RideRequestService;
import com.vaishnavi.cab.booking.exceptions.RideRequestNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoRideRequestsFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RideRequestServiceImpl implements RideRequestService {

    private static final Logger logger = LoggerFactory.getLogger(RideRequestServiceImpl.class);

    @Autowired
    private RideRequestRepository repo;

    public List<RideRequest> getAllRequests() throws Exception {
        logger.info("Inside RideRequestServiceImpl.getAllRequests()");
        List<RideRequest> list = repo.retrieve();
        if (list.isEmpty()) throw new NoRideRequestsFoundException();
        return list;
    }

    public boolean addRequest(RideRequest request) {
        logger.info("Inside RideRequestServiceImpl.addRequest()");
        return repo.store(request);
    }

    public boolean deleteRequest(int id) {
        logger.info("Inside RideRequestServiceImpl.deleteRequest()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new RideRequestNotFoundException();
        }
        return true;
    }

    public RideRequest findRequest(int id) throws Exception {
        logger.info("Inside RideRequestServiceImpl.findRequest()");
        RideRequest req = repo.search(id);
        if (req == null) throw new RideRequestNotFoundException();
        return req;
    }

    @Override
    public List<RideRequest> retrieveRideRequests() {
        return List.of();
    }

    @Override
    public boolean storeRideRequest(RideRequest rideRequest) {
        return false;
    }

    @Override
    public boolean deleteRideRequest(int id) {
        return false;
    }

    @Override
    public RideRequest searchRideRequest(int id) {
        return null;
    }
}

