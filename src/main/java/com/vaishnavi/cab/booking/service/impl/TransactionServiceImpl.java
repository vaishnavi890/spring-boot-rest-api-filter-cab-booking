package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Transaction;
import com.vaishnavi.cab.booking.repository.TransactionRepository;
import com.vaishnavi.cab.booking.service.TransactionService;
import com.vaishnavi.cab.booking.exceptions.TransactionNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoTransactionsFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private static final Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Autowired
    private TransactionRepository repo;

    public List<Transaction> getAllTransactions() throws Exception {
        logger.info("Inside TransactionServiceImpl.getAllTransactions()");
        List<Transaction> list = repo.retrieve();
        if (list.isEmpty()) throw new NoTransactionsFoundException();
        return list;
    }

    public boolean addTransaction(Transaction transaction) {
        logger.info("Inside TransactionServiceImpl.addTransaction()");
        return repo.store(transaction);
    }

    public boolean deleteTransaction(int id) {
        logger.info("Inside TransactionServiceImpl.deleteTransaction()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new TransactionNotFoundException();
        }
        return true;
    }

    public Transaction findTransaction(int id) throws Exception {
        logger.info("Inside TransactionServiceImpl.findTransaction()");
        Transaction txn = repo.search(id);
        if (txn == null) throw new TransactionNotFoundException();
        return txn;
    }

    @Override
    public List<Transaction> retrieveTransactions() {
        return List.of();
    }

    @Override
    public boolean storeTransaction(Transaction transaction) {
        return false;
    }

    @Override
    public Transaction searchTransaction(int id) {
        return null;
    }
}

