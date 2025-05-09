package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Payment;
import java.util.List;

public interface PaymentService {
    boolean makePayment(Payment payment);
    List<Payment> getAllPayments() throws Exception;
    Payment getPaymentById(int id) throws Exception;
    boolean cancelPayment(int id) throws Exception;
}



