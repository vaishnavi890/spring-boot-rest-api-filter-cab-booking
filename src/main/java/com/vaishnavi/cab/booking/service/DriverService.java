package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Driver;
import java.util.List;

public interface DriverService {
    List<Driver> getAllDrivers() throws Exception;
    boolean addDriver(Driver driver);
    boolean deleteDriver(int id);
    Driver findDriver(int id) throws Exception;
}




