package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
public class RideController {

    @Autowired
    private RideService rideService;

    @PostMapping
    public String addRide(@RequestBody Ride ride) {
        rideService.addRide(ride);
        return "Ride added successfully!";
    }

    @GetMapping
    public List<Ride> getAllRides() throws Exception {
        return rideService.getAllRides();
    }

    @GetMapping("/{id}")
    public Ride getRide(@PathVariable int id) throws Exception {
        return rideService.getRideById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteRide(@PathVariable int id) throws Exception {
        rideService.removeRide(id);
        return "Ride deleted successfully!";
    }
}


