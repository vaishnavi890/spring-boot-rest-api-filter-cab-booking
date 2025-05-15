package com.vaishnavi.cab.booking.exceptions;

public class NoRidesFoundException extends RuntimeException {
    public NoRidesFoundException() {
        super("No rides available in the system.");
    }

    public NoRidesFoundException(String message) {
        super(message);
    }
}


