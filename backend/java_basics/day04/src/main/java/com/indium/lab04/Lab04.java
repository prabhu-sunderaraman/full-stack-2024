package com.indium.lab04;

public class Lab04 {
    public static void main(String[] args) {
        Account account = new Account(10001, 30000);
        account.deposit(1000);
        account.deposit(1000);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        System.out.println("Account balance: %s".formatted(account.getBalance()));
        account.printStatement();

        System.out.println("**** Current Account ****");
        Account currentAccount = new CurrentAccount(121212, 1000000);
        currentAccount.deposit(1000);
        currentAccount.deposit(1000);
        for (int i = 0; i < 15; i++) {
            currentAccount.withdraw(100);
        }
        System.out.println("Current Account balance: %s".formatted(currentAccount.getBalance()));
        currentAccount.printStatement();

        System.out.println("****Premium Current Account ****");
        Account premiumCurrentAccount = new PremiumCurrentAccount(1212312, 90000000);
        premiumCurrentAccount.deposit(1000);
        premiumCurrentAccount.deposit(1000);
        for (int i = 0; i < 150; i++) {
            premiumCurrentAccount.withdraw(100);
        }
        System.out.println("Premium Current Account balance: %s".formatted(premiumCurrentAccount.getBalance()));
        premiumCurrentAccount.printStatement();
    }
}
