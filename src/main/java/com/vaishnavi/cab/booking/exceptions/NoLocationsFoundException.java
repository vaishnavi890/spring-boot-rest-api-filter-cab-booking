package com.vaishnavi.cab.booking.exceptions;

public class NoLocationsFoundException extends RuntimeException {
    public NoLocationsFoundException() {
        super("No locations found.");
    }

    public NoLocationsFoundException(String message) {
        super(message);
    }
}


