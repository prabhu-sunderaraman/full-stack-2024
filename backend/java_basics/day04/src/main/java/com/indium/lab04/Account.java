package com.indium.lab04;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Account {
    private long accountNumber;
    private double balance;
    private int withdrawCount;
    private Set<AccountTransaction> transactions; // Unordered collection; So Set is not recommended here
    private Set<AccountTransactionRecord> transactionRecords;

    public Account(long accountNumber, double balance) {
        if (balance < 10000) {
            throw new RuntimeException(AccountMessages.INITIAL_BALANCE);
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new HashSet<>();
        this.transactionRecords = new HashSet<>();
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.transactions.add(new AccountTransaction(accountNumber, amount, "CREDIT"));
        this.transactionRecords.add(new AccountTransactionRecord(accountNumber, amount, TransactionTypeEnum.CREDIT, LocalDateTime.now()));
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new RuntimeException(AccountMessages.INSUFFICIENT_BALANCE.formatted(amount));
        }
        if (amount > getWithdrawLimit()) {
            throw new RuntimeException(AccountMessages.WITHDRAW_LIMIT_EXCEEDED.formatted(getWithdrawLimit()));
        }
        this.balance -= amount;
        this.transactions.add(new AccountTransaction(accountNumber, amount, "DEBIT"));
        this.transactionRecords.add(new AccountTransactionRecord(accountNumber, amount, TransactionTypeEnum.DEBIT, LocalDateTime.now()));
        this.withdrawCount++;
        if (this.withdrawCount > getNumberOfWithdrawsLimit()) {
            double fee = amount * 0.005;
            this.balance -= fee;
            this.transactions.add(new AccountTransaction(accountNumber, amount, "WITHDRAWAL FEE"));
            this.transactionRecords.add(new AccountTransactionRecord(accountNumber, amount, TransactionTypeEnum.WITHDRAWAL_FEE, LocalDateTime.now()));
        }
    }

    public int getNumberOfWithdrawsLimit() {
        return 3;
    }

    public double getWithdrawLimit() {
        return Double.MAX_VALUE;
    }

    public double getBalance() {
        return this.balance;
    }

    public void printStatement() {
//        for (AccountTransaction accountTransaction : this.transactions) {
//            System.out.println(accountTransaction);
//        }

        for (AccountTransactionRecord accountTransactionRecord : this.transactionRecords) {
            System.out.println(accountTransactionRecord);
        }
    }
}
