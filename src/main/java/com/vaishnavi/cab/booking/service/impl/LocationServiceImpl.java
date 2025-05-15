package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Location;
import com.vaishnavi.cab.booking.repository.LocationRepository;
import com.vaishnavi.cab.booking.service.LocationService;
import com.vaishnavi.cab.booking.exceptions.LocationNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoLocationsFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private static final Logger logger = LoggerFactory.getLogger(LocationServiceImpl.class);

    @Autowired
    private LocationRepository repo;

    public List<Location> getAllLocations() throws Exception {
        logger.info("Inside LocationServiceImpl.getAllLocations()");
        List<Location> list = repo.retrieve();
        if (list.isEmpty()) throw new NoLocationsFoundException();
        return list;
    }

    public boolean addLocation(Location location) {
        logger.info("Inside LocationServiceImpl.addLocation()");
        return repo.store(location);
    }

    public boolean deleteLocation(int id) {
        logger.info("Inside LocationServiceImpl.deleteLocation()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new LocationNotFoundException();
        }
        return true;
    }

    public Location findLocation(int id) throws Exception {
        logger.info("Inside LocationServiceImpl.findLocation()");
        Location location = repo.search(id);
        if (location == null) throw new LocationNotFoundException();
        return location;
    }
}

