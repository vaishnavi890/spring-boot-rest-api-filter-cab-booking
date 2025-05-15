package com.vaishnavi.cab.booking.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private int locationId;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    public void setLocationId(int i) {

    }
}


