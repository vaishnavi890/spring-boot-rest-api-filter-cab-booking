package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.BookingHistory;
import java.util.List;

public interface BookingHistoryService {
    List<BookingHistory> getAllBookings() throws Exception;
    boolean addBooking(BookingHistory history);
    boolean deleteBooking(int id);
    BookingHistory findBooking(int id) throws Exception;

    List<BookingHistory> retrieveBookingHistory();

    boolean storeBookingHistory(BookingHistory history);

    boolean deleteBookingHistory(int id);

    BookingHistory searchBookingHistory(int id);
}

