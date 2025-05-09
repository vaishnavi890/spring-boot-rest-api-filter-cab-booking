package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cab/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverService.getDrivers();
    }

    @GetMapping("/{id}")
    public Driver getDriver(@PathVariable int id) {
        return driverService.getDriver(id);
    }

    @PostMapping
    public void addDriver(@RequestBody Driver driver) {
        driverService.createDriver(driver);
    }

    @PutMapping("/{id}")
    public void updateDriver(@PathVariable int id, @RequestBody Driver driver) {
        driverService.modifyDriver(id, driver);
    }

    @DeleteMapping("/{id}")
    public void deleteDriver(@PathVariable int id) {
        driverService.removeDriver(id);
    }
}


