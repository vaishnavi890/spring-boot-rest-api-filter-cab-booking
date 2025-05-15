package com.vaishnavi.cab.booking.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookingHistory {
    private int historyId;
    private int userId;
    private int rideId;
    private String bookingDate;
    private String status;

    public void setHistoryId(int i) {
    }
}


