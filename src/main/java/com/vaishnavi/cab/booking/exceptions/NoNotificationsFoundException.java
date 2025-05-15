package com.vaishnavi.cab.booking.exceptions;

public class NoNotificationsFoundException extends RuntimeException {
    public NoNotificationsFoundException() {
        super("No notifications found.");
    }

    public NoNotificationsFoundException(String message) {
        super(message);
    }
}


