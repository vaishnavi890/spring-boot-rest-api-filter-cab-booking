package com.vaishnavi.cab.booking.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cab {
    private int cabId;
    private String cabNumber;
    private String cabModel;
    private String cabType;
    private String licensePlate;
    private int driverId;

    public void setCabId(int i) {

    }
}

