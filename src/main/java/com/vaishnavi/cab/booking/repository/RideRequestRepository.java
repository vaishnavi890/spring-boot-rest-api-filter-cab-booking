package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.RideRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RideRequestRepository implements EntityRepository<RideRequest> {
    private static final Logger logger = LoggerFactory.getLogger(RideRequestRepository.class);
    private final List<RideRequest> requestList = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean store(RideRequest request) {
        logger.info("Inside RideRequestRepository.store()");
        request.setRequestId(++index);
        requestList.add(index, request);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        logger.info("Inside RideRequestRepository.delete()");
        requestList.remove(id);
        return true;
    }

    @Override
    public List<RideRequest> retrieve() throws Exception {
        logger.info("Inside RideRequestRepository.retrieve()");
        return requestList;
    }

    @Override
    public RideRequest search(int id) throws Exception {
        logger.info("Inside RideRequestRepository.search()");
        return requestList.get(id);
    }
}


