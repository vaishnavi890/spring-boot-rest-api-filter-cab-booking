package com.vaishnavi.cab.booking.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RideRequest {
    private int requestId;
    private int userId;
    private String pickupLocation;
    private String dropoffLocation;
    private String status;

    public void setRequestId(int i) {

    }
}


