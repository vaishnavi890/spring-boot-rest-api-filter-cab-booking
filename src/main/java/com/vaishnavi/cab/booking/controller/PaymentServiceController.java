package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentServiceController {

    private static final Logger logger = LoggerFactory.getLogger(PaymentServiceController.class);

    @Autowired
    private PaymentService service;

    @GetMapping("/payments")
    public ResponseEntity<List<Payment>> getPayments() {
        logger.info("GET /payments called");
        return new ResponseEntity<>(service.retrievePayments(), HttpStatus.OK);
    }

    @PostMapping("/payments")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addPayment(@RequestBody Payment payment) {
        logger.info("POST /payments called");
        return new ResponseEntity<>(service.storePayment(payment) ? "Payment added" : "Payment not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/payments/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deletePayment(@PathVariable int id) {
        logger.info("DELETE /payments/" + id);
        return new ResponseEntity<>(service.deletePayment(id) ? "Payment deleted" : "Payment not deleted", HttpStatus.OK);
    }

    @GetMapping("/payments/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Payment> getPaymentById(@PathVariable int id) {
        logger.info("GET /payments/" + id);
        return new ResponseEntity<>(service.searchPayment(id), HttpStatus.OK);
    }
}


