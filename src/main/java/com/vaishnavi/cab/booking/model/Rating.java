package com.vaishnavi.cab.booking.model;

public class Rating {
    private int id;
    private int rideId;
    private int userId;
    private int driverId;
    private int rating; // 1 to 5
    private String review;

    // Constructors
    public Rating() {}

    public Rating(int rideId, int userId, int driverId, int rating, String review) {
        this.rideId = rideId;
        this.userId = userId;
        this.driverId = driverId;
        this.rating = rating;
        this.review = review;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getRideId() { return rideId; }
    public void setRideId(int rideId) { this.rideId = rideId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getDriverId() { return driverId; }
    public void setDriverId(int driverId) { this.driverId = driverId; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public String getReview() { return review; }
    public void setReview(String review) { this.review = review; }

    public void setRatingId(int i) {

    }
}


