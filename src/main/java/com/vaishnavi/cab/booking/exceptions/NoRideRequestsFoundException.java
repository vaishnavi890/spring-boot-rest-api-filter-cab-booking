package com.vaishnavi.cab.booking.exceptions;

public class NoRideRequestsFoundException extends RuntimeException {
    public NoRideRequestsFoundException() {
        super("No ride requests found.");
    }

    public NoRideRequestsFoundException(String message) {
        super(message);
    }
}


