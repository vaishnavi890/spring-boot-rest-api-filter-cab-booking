package com.vaishnavi.cab.booking.exceptions;

public class NoPaymentsFoundException extends RuntimeException {
    public NoPaymentsFoundException() {
        super("No payments found.");
    }

    public NoPaymentsFoundException(String message) {
        super(message);
    }
}


