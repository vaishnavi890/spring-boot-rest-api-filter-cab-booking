package com.vaishnavi.cab.booking.exceptions;

public class NoUsersFoundException extends RuntimeException {
    public NoUsersFoundException() {
        super("No payments found.");
    }

    public NoUsersFoundException(String message) {
        super(message);
    }
}

