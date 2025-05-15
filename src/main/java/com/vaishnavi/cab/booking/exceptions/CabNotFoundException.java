package com.vaishnavi.cab.booking.exceptions;

public class CabNotFoundException extends RuntimeException {
    public CabNotFoundException() {
        super("Cab not found.");
    }

    public CabNotFoundException(String message) {
        super(message);
    }
}



