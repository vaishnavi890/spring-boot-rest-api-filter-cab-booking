package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String makePayment(@RequestBody Payment payment) {
        paymentService.makePayment(payment);
        return "Payment successful!";
    }

    @GetMapping
    public List<Payment> getAllPayments() throws Exception {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Payment getPayment(@PathVariable int id) throws Exception {
        return paymentService.getPaymentById(id);
    }

    @DeleteMapping("/{id}")
    public String cancelPayment(@PathVariable int id) throws Exception {
        paymentService.cancelPayment(id);
        return "Payment cancelled.";
    }
}


