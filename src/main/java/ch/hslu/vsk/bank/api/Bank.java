package ch.hslu.vsk.bank.api;

import java.util.Currency;

public interface Bank {
    void deposit(Currency currency, double amount);

    void withdraw(Currency currency, double amount);

    double getAmount();

    void shutdown();
}
