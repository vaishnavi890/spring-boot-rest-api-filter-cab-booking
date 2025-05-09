package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Driver;
import java.util.List;

public interface DriverRepository {
    List<Driver> getAllDrivers();
    Driver getDriverById(int id);
    void addDriver(Driver driver);
    void updateDriver(int id, Driver driver);
    void deleteDriver(int id);
}


