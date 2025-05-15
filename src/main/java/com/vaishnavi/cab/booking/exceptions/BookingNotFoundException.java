package com.vaishnavi.cab.booking.exceptions;

public class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException() {
        super("Booking history not found.");
    }

    public BookingNotFoundException(String message) {
        super(message);
    }
}


