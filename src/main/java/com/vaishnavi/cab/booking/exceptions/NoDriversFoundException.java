package com.vaishnavi.cab.booking.exceptions;

public class NoDriversFoundException extends RuntimeException {
    public NoDriversFoundException() {
        super("No locations found.");
    }

    public NoDriversFoundException(String message) {
        super(message);
    }
}

