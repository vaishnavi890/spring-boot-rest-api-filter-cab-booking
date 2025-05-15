package com.vaishnavi.cab.booking.exceptions;

public class RideRequestNotFoundException extends RuntimeException {
    public RideRequestNotFoundException() {
        super("Ride request not found.");
    }

    public RideRequestNotFoundException(String message) {
        super(message);
    }
}

