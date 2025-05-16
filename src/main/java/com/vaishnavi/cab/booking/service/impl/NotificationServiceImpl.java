package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Notification;
import com.vaishnavi.cab.booking.repository.NotificationRepository;
import com.vaishnavi.cab.booking.service.NotificationService;
import com.vaishnavi.cab.booking.exceptions.NotificationNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoNotificationsFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(NotificationServiceImpl.class);

    @Autowired
    private NotificationRepository repo;

    public List<Notification> getAllNotifications() throws Exception {
        logger.info("Inside NotificationServiceImpl.getAllNotifications()");
        List<Notification> list = repo.retrieve();
        if (list.isEmpty()) throw new NoNotificationsFoundException();
        return list;
    }

    public boolean addNotification(Notification notification) {
        logger.info("Inside NotificationServiceImpl.addNotification()");
        return repo.store(notification);
    }

    public boolean deleteNotification(int id) {
        logger.info("Inside NotificationServiceImpl.deleteNotification()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new NotificationNotFoundException();
        }
        return true;
    }

    public Notification findNotification(int id) throws Exception {
        logger.info("Inside NotificationServiceImpl.findNotification()");
        Notification notification = repo.search(id);
        if (notification == null) throw new NotificationNotFoundException();
        return notification;
    }

    @Override
    public List<Notification> retrieveNotifications() {
        return List.of();
    }

    @Override
    public boolean storeNotification(Notification notification) {
        return false;
    }

    @Override
    public Notification searchNotification(int id) {
        return null;
    }
}



