package com.vaishnavi.cab.booking.repository.impl;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.repository.PaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {
    private static final Logger logger = LoggerFactory.getLogger(PaymentRepositoryImpl.class);
    private final List<Payment> paymentList = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean store(Payment payment) {
        logger.info("Inside PaymentRepository.store()");
        payment.setId((long) ++index);
        paymentList.add(payment);
        return true;
    }

    @Override
    public List<Payment> retrieve() {
        logger.info("Inside PaymentRepository.retrieve()");
        return paymentList;
    }

    @Override
    public Payment search(int id) {
        logger.info("Inside PaymentRepository.search()");
        return paymentList.get(id);
    }

    @Override
    public boolean delete(int id) {
        logger.info("Inside PaymentRepository.delete()");
        paymentList.remove(id);
        return true;
    }
}


