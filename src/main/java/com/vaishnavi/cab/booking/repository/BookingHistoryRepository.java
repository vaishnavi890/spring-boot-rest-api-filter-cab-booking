package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.BookingHistory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookingHistoryRepository implements EntityRepository<BookingHistory> {
    private static final Logger logger = LoggerFactory.getLogger(BookingHistoryRepository.class);
    private final List<BookingHistory> historyList = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean store(BookingHistory history) {
        logger.info("Inside BookingHistoryRepository.store()");
        history.setHistoryId(++index);
        historyList.add(index, history);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        logger.info("Inside BookingHistoryRepository.delete()");
        historyList.remove(id);
        return true;
    }

    @Override
    public List<BookingHistory> retrieve() throws Exception {
        logger.info("Inside BookingHistoryRepository.retrieve()");
        return historyList;
    }

    @Override
    public BookingHistory search(int id) throws Exception {
        logger.info("Inside BookingHistoryRepository.search()");
        return historyList.get(id);
    }
}


