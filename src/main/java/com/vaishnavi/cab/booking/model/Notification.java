package com.vaishnavi.cab.booking.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    private int notificationId;
    private int userId;
    private String message;
    private String timestamp;
    private boolean isRead;

    public void setNotificationId(int i) {

    }
}



