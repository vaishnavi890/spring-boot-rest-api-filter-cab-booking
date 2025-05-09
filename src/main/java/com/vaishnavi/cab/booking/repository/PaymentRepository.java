package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Payment;
import java.util.List;

public interface PaymentRepository {
    boolean store(Payment payment);
    List<Payment> retrieve() throws Exception;
    Payment search(int id) throws Exception;
    boolean delete(int id) throws Exception;
}

