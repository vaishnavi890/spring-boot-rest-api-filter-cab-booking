package com.vaishnavi.cab.booking.exceptions;

public class NoRatingsFoundException extends RuntimeException {
    public NoRatingsFoundException() {
        super("No ratings found.");
    }

    public NoRatingsFoundException(String message) {
        super(message);
    }
}



