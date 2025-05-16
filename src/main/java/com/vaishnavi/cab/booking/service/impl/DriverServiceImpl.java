package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.repository.DriverRepository;
import com.vaishnavi.cab.booking.service.DriverService;
import com.vaishnavi.cab.booking.exceptions.DriverNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoDriversFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    private static final Logger logger = LoggerFactory.getLogger(DriverServiceImpl.class);

    @Autowired
    private DriverRepository repo;

    @Override
    public List<Driver> getAllDrivers() throws Exception {
        logger.info("Inside DriverServiceImpl.getAllDrivers()");
        List<Driver> list = repo.retrieve();
        if (list.isEmpty()) throw new NoDriversFoundException();
        return list;
    }

    @Override
    public boolean addDriver(Driver driver) {
        logger.info("Inside DriverServiceImpl.addDriver()");
        return repo.store(driver);
    }

    @Override
    public boolean deleteDriver(int id) {
        logger.info("Inside DriverServiceImpl.deleteDriver()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new DriverNotFoundException();
        }
        return true;
    }

    @Override
    public Driver findDriver(int id) throws Exception {
        logger.info("Inside DriverServiceImpl.findDriver()");
        Driver driver = repo.search(id);
        if (driver == null) throw new DriverNotFoundException();
        return driver;
    }

    @Override
    public List<Driver> retrieveDrivers() {
        return List.of();
    }

    @Override
    public boolean storeDriver(Driver driver) {
        return false;
    }

    @Override
    public Driver searchDriver(int id) {
        return null;
    }
}


