package com.vaishnavi.cab.booking.service.impl;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.repository.PaymentRepository;
import com.vaishnavi.cab.booking.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepo;

    @Override
    public boolean makePayment(Payment payment) {
        return paymentRepo.store(payment);
    }

    @Override
    public List<Payment> getAllPayments() throws Exception {
        return paymentRepo.retrieve();
    }

    @Override
    public Payment getPaymentById(int id) throws Exception {
        return paymentRepo.search(id);
    }

    @Override
    public boolean cancelPayment(int id) throws Exception {
        return paymentRepo.delete(id);
    }
}


