package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.BookingHistory;
import com.vaishnavi.cab.booking.service.BookingHistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingHistoryServiceController {

    private static final Logger logger = LoggerFactory.getLogger(BookingHistoryServiceController.class);

    @Autowired
    private BookingHistoryService service;

    @GetMapping("/bookinghistory")
    public ResponseEntity<List<BookingHistory>> getBookingHistory() {
        logger.info("GET /bookinghistory called");
        return new ResponseEntity<>(service.retrieveBookingHistory(), HttpStatus.OK);
    }

    @PostMapping("/bookinghistory")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addBookingHistory(@RequestBody BookingHistory history) {
        logger.info("POST /bookinghistory called");
        return new ResponseEntity<>(service.storeBookingHistory(history) ? "Booking history added" : "Booking history not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/bookinghistory/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteBookingHistory(@PathVariable int id) {
        logger.info("DELETE /bookinghistory/" + id);
        return new ResponseEntity<>(service.deleteBookingHistory(id) ? "Booking history deleted" : "Booking history not deleted", HttpStatus.OK);
    }

    @GetMapping("/bookinghistory/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<BookingHistory> getBookingHistoryById(@PathVariable int id) {
        logger.info("GET /bookinghistory/" + id);
        return new ResponseEntity<>(service.searchBookingHistory(id), HttpStatus.OK);
    }
}


