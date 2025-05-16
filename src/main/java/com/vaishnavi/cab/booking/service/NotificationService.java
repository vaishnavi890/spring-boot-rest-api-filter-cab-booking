package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Notification;
import java.util.List;

public interface NotificationService {
    List<Notification> getAllNotifications() throws Exception;
    boolean addNotification(Notification notification);
    boolean deleteNotification(int id);
    Notification findNotification(int id) throws Exception;

    List<Notification> retrieveNotifications();

    boolean storeNotification(Notification notification);

    Notification searchNotification(int id);
}

