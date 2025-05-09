package com.vaishnavi.cab.booking.model;

public class Driver {
    private int driverId;
    private String name;
    private String email;
    private String phone;
    private String cabNumber;
    private String cabType;

    public Driver() {}

    public Driver(int driverId, String name, String email, String phone, String cabNumber, String cabType) {
        this.driverId = driverId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cabNumber = cabNumber;
        this.cabType = cabType;
    }

    public int getDriverId() { return driverId; }
    public void setDriverId(int driverId) { this.driverId = driverId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getCabNumber() { return cabNumber; }
    public void setCabNumber(String cabNumber) { this.cabNumber = cabNumber; }

    public String getCabType() { return cabType; }
    public void setCabType(String cabType) { this.cabType = cabType; }
}


