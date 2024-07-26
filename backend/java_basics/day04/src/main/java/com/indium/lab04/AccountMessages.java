package com.indium.lab04;

public interface AccountMessages {
    // All the variables in an interface are implicitly public, static and final
    String INSUFFICIENT_BALANCE = "Insufficient balance for withdrawing Rs.%s";
    String WITHDRAW_LIMIT_EXCEEDED = "Withdraw denied. Limit is Rs.%s";
    String INITIAL_BALANCE = "Initial balance should be minimum 10000";
}
