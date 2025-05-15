package com.vaishnavi.cab.booking.exceptions;

public class NoTransactionsFoundException extends RuntimeException {
    public NoTransactionsFoundException() {
        super("No transactions found.");
    }

    public NoTransactionsFoundException(String message) {
        super(message);
    }
}


