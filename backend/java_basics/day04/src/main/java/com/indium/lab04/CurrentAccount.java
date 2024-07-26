package com.indium.lab04;

public class CurrentAccount extends Account {
    public CurrentAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public int getNumberOfWithdrawsLimit() {
        return 10;
    }

    @Override
    public double getWithdrawLimit() {
        return 100000;
    }
}
