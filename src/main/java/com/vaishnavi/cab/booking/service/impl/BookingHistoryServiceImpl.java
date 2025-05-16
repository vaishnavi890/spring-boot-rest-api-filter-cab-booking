package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.exceptions.BookingNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoBookingHistoryFoundException;
import com.vaishnavi.cab.booking.model.BookingHistory;
import com.vaishnavi.cab.booking.repository.BookingHistoryRepository;
import com.vaishnavi.cab.booking.service.BookingHistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookingHistoryServiceImpl implements BookingHistoryService {

    private static final Logger logger = LoggerFactory.getLogger(BookingHistoryServiceImpl.class);

    @Autowired
    private BookingHistoryRepository repo;

    public List<BookingHistory> getAllBookings() throws Exception {
        logger.info("Inside BookingHistoryServiceImpl.getAllBookings()");
        List<BookingHistory> list = repo.retrieve();
        if (list.isEmpty()) throw new NoBookingHistoryFoundException();
        return list;
    }

    public boolean addBooking(BookingHistory history) {
        logger.info("Inside BookingHistoryServiceImpl.addBooking()");
        return repo.store(history);
    }

    public boolean deleteBooking(int id) {
        logger.info("Inside BookingHistoryServiceImpl.deleteBooking()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new BookingNotFoundException();
        }
        return true;
    }

    public BookingHistory findBooking(int id) throws Exception {
        logger.info("Inside BookingHistoryServiceImpl.findBooking()");
        BookingHistory booking = repo.search(id);
        if (booking == null) throw new BookingNotFoundException();
        return booking;
    }

    @Override
    public List<BookingHistory> retrieveBookingHistory() {
        return List.of();
    }

    @Override
    public boolean storeBookingHistory(BookingHistory history) {
        return false;
    }

    @Override
    public boolean deleteBookingHistory(int id) {
        return false;
    }

    @Override
    public BookingHistory searchBookingHistory(int id) {
        return null;
    }
}


