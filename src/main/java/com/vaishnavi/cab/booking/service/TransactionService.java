package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Transaction;
import java.util.List;

public interface TransactionService {
    List<Transaction> getAllTransactions() throws Exception;
    boolean addTransaction(Transaction transaction);
    boolean deleteTransaction(int id);
    Transaction findTransaction(int id) throws Exception;

    List<Transaction> retrieveTransactions();

    boolean storeTransaction(Transaction transaction);

    Transaction searchTransaction(int id);
}

