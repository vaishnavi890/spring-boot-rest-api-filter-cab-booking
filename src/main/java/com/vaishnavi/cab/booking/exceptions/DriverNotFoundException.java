package com.vaishnavi.cab.booking.exceptions;

public class DriverNotFoundException extends RuntimeException {
    public DriverNotFoundException() {
        super("Location not found.");
    }

    public DriverNotFoundException(String message) {
        super(message);
    }
}

