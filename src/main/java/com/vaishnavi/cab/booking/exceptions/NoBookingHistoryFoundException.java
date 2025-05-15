package com.vaishnavi.cab.booking.exceptions;

public class NoBookingHistoryFoundException extends RuntimeException {
    public NoBookingHistoryFoundException() {
        super("No booking history found.");
    }

    public NoBookingHistoryFoundException(String message) {
        super(message);
    }
}



