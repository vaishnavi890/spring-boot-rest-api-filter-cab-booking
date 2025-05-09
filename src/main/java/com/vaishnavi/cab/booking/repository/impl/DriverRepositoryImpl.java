package com.vaishnavi.cab.booking.repository.impl;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.repository.DriverRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DriverRepositoryImpl implements DriverRepository {

    private final List<Driver> drivers = new ArrayList<>();

    public DriverRepositoryImpl() {
        drivers.add(new Driver(1, "John", "john@cab.com", "5551112222", "CAB001", "Sedan"));
        drivers.add(new Driver(2, "Emma", "emma@cab.com", "5553334444", "CAB002", "SUV"));
    }

    @Override
    public List<Driver> getAllDrivers() {
        return drivers;
    }

    @Override
    public Driver getDriverById(int id) {
        return drivers.stream().filter(d -> d.getDriverId() == id).findFirst().orElse(null);
    }

    @Override
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    @Override
    public void updateDriver(int id, Driver driver) {
        deleteDriver(id);
        drivers.add(driver);
    }

    @Override
    public void deleteDriver(int id) {
        drivers.removeIf(d -> d.getDriverId() == id);
    }
}


