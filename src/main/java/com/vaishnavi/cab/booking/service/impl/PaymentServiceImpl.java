package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.repository.PaymentRepository;
import com.vaishnavi.cab.booking.service.PaymentService;
import com.vaishnavi.cab.booking.exceptions.PaymentNotFoundException;
import com.vaishnavi.cab.booking.exceptions.NoPaymentsFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private static final Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);

    @Autowired
    private PaymentRepository repo;

    public List<Payment> getAllPayments() throws Exception {
        logger.info("Inside PaymentServiceImpl.getAllPayments()");
        List<Payment> list = repo.retrieve();
        if (list.isEmpty()) throw new NoPaymentsFoundException();
        return list;
    }

    public boolean addPayment(Payment payment) {
        logger.info("Inside PaymentServiceImpl.addPayment()");
        return repo.store(payment);
    }

    public boolean deletePayment(int id) {
        logger.info("Inside PaymentServiceImpl.deletePayment()");
        try {
            repo.delete(id);
        } catch (Exception e) {
            throw new PaymentNotFoundException();
        }
        return true;
    }

    public Payment findPayment(int id) throws Exception {
        logger.info("Inside PaymentServiceImpl.findPayment()");
        Payment payment = repo.search(id);
        if (payment == null) throw new PaymentNotFoundException();
        return payment;
    }
}

