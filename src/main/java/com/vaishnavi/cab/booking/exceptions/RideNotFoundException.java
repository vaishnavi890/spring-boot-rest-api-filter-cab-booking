package com.vaishnavi.cab.booking.exceptions;

public class RideNotFoundException extends RuntimeException {
    public RideNotFoundException() {
        super("Ride not found in the system.");
    }

    public RideNotFoundException(String message) {
        super(message);
    }
}


