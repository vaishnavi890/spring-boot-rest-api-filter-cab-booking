package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.repository.DriverRepository;
import com.vaishnavi.cab.booking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public List<Driver> getDrivers() {
        return driverRepository.getAllDrivers();
    }

    @Override
    public Driver getDriver(int id) {
        return driverRepository.getDriverById(id);
    }

    @Override
    public void createDriver(Driver driver) {
        driverRepository.addDriver(driver);
    }

    @Override
    public void modifyDriver(int id, Driver driver) {
        driverRepository.updateDriver(id, driver);
    }

    @Override
    public void removeDriver(int id) {
        driverRepository.deleteDriver(id);
    }
}


