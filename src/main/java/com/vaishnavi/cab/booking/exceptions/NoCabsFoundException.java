package com.vaishnavi.cab.booking.exceptions;

public class NoCabsFoundException extends RuntimeException {
    public NoCabsFoundException() {
        super("No cabs found.");
    }

    public NoCabsFoundException(String message) {
        super(message);
    }
}


