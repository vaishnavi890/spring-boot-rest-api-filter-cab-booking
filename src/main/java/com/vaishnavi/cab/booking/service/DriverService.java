package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Driver;
import java.util.List;

public interface DriverService {
    List<Driver> getDrivers();
    Driver getDriver(int id);
    void createDriver(Driver driver);
    void modifyDriver(int id, Driver driver);
    void removeDriver(int id);
}



