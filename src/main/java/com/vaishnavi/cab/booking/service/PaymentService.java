package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Payment;
import java.util.List;

public interface PaymentService {
    List<Payment> getAllPayments() throws Exception;
    boolean addPayment(Payment payment);
    boolean deletePayment(int id);
    Payment findPayment(int id) throws Exception;

    List<Payment> retrievePayments();

    boolean storePayment(Payment payment);

    Payment searchPayment(int id);
}



