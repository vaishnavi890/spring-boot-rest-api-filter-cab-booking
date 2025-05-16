package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Transaction;
import com.vaishnavi.cab.booking.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionServiceController {

    private static final Logger logger = LoggerFactory.getLogger(TransactionServiceController.class);

    @Autowired
    private TransactionService service;

    @GetMapping("/transactions")
    public ResponseEntity<List<Transaction>> getTransactions() {
        logger.info("GET /transactions called");
        return new ResponseEntity<>(service.retrieveTransactions(), HttpStatus.OK);
    }

    @PostMapping("/transactions")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> addTransaction(@RequestBody Transaction transaction) {
        logger.info("POST /transactions called");
        return new ResponseEntity<>(service.storeTransaction(transaction) ? "Transaction added" : "Transaction not added", HttpStatus.CREATED);
    }

    @DeleteMapping("/transactions/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> deleteTransaction(@PathVariable int id) {
        logger.info("DELETE /transactions/" + id);
        return new ResponseEntity<>(service.deleteTransaction(id) ? "Transaction deleted" : "Transaction not deleted", HttpStatus.OK);
    }

    @GetMapping("/transactions/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable int id) {
        logger.info("GET /transactions/" + id);
        return new ResponseEntity<>(service.searchTransaction(id), HttpStatus.OK);
    }
}



