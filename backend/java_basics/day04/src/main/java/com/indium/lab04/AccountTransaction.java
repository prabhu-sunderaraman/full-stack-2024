package com.indium.lab04;

import java.time.LocalDateTime;

public class AccountTransaction {
    private long accountNumber;
    private double amount;
    private String transactionType;
    private LocalDateTime time;

    public AccountTransaction(long accountNumber, double amount, String transactionType) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
        this.time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "{" +
                "accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                ", time=" + time +
                '}';
    }
}
