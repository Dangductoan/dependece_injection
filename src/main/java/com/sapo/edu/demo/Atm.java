package com.sapo.edu.demo;

import java.math.BigDecimal;

public interface Atm {
    void withDraw(Customer customer, BigDecimal amount);

    void printCurrentMoney();

    void deposit(Customer customer, BigDecimal amount);

    void displayCustomerInfo(Customer customer);
}
