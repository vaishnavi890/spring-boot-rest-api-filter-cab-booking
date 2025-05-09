package com.vaishnavi.cab.booking.model;

public class Payment {
    private int id;
    private int rideId;
    private int userId;
    private double amount;
    private String paymentMethod; // e.g., "Card", "Cash", "UPI"
    private String status; // e.g., "Paid", "Pending", "Failed"

    // Constructors
    public Payment() {}

    public Payment(int rideId, int userId, double amount, String paymentMethod, String status) {
        this.rideId = rideId;
        this.userId = userId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getRideId() { return rideId; }
    public void setRideId(int rideId) { this.rideId = rideId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}


