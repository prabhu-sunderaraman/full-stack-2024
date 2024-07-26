package com.indium.lab04;

public class PremiumCurrentAccount extends Account {
    public PremiumCurrentAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public int getNumberOfWithdrawsLimit() {
        return 100;
    }

    @Override
    public double getWithdrawLimit() {
        return 1000000;
    }
}
