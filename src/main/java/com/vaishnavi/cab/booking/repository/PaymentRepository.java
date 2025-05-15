package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PaymentRepository implements EntityRepository<Payment> {
    private static final Logger logger = LoggerFactory.getLogger(PaymentRepository.class);
    private final List<Payment> paymentList = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean store(Payment payment) {
        logger.info("Inside PaymentRepository.store()");
        payment.setPaymentId(++index);
        paymentList.add(index, payment);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        logger.info("Inside PaymentRepository.delete()");
        paymentList.remove(id);
        return true;
    }

    @Override
    public List<Payment> retrieve() throws Exception {
        logger.info("Inside PaymentRepository.retrieve()");
        return paymentList;
    }

    @Override
    public Payment search(int id) throws Exception {
        logger.info("Inside PaymentRepository.search()");
        return paymentList.get(id);
    }
}



