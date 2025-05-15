package com.vaishnavi.cab.booking.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("Ride not found in the system.");
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}



