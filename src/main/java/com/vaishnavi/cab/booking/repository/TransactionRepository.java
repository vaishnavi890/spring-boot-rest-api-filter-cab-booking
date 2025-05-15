package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransactionRepository implements EntityRepository<Transaction> {
    private static final Logger logger = LoggerFactory.getLogger(TransactionRepository.class);
    private final List<Transaction> transactionList = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean store(Transaction transaction) {
        logger.info("Inside TransactionRepository.store()");
        transaction.setTransactionId(++index);
        transactionList.add(index, transaction);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        logger.info("Inside TransactionRepository.delete()");
        transactionList.remove(id);
        return true;
    }

    @Override
    public List<Transaction> retrieve() throws Exception {
        logger.info("Inside TransactionRepository.retrieve()");
        return transactionList;
    }

    @Override
    public Transaction search(int id) throws Exception {
        logger.info("Inside TransactionRepository.search()");
        return transactionList.get(id);
    }
}



