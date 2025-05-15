package com.vaishnavi.cab.booking.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private int transactionId;
    private int paymentId;
    private double amount;
    private String transactionDate;
    private String transactionType;

    public void setTransactionId(int i) {
    }
}


