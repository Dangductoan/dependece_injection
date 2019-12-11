package com.sapo.edu.demo;

import java.math.BigDecimal;

public class Atm {
    private BigDecimal moneyAtm = new BigDecimal(1000000);

    private PrinterConsole printer = new PrinterConsole();

    public void withDraw(Customer customer, BigDecimal amount) {
        if (amount == null || amount.compareTo(new BigDecimal(0)) < 0) {
            printer.printMessage("Amount is invalid");
            return;
        }
        if (customer.getBalance().compareTo(amount) < 0) {
            printer.printMessage("Insufficient Balance");
            return;
        }
        if (amount.compareTo(moneyAtm) >= 0) {
            printer.printMessage("ATM is out of money");
            return;
        }

        BigDecimal currentBalance = customer.getBalance();
        customer.setBalance(currentBalance.subtract(amount));
        moneyAtm = moneyAtm.subtract(amount);
    }

    public void printCurrentMoney(){
        printer.printMessage("Current ATM money is " + moneyAtm.toString());
    }

    public void deposit(Customer customer, BigDecimal amount){
        if (amount == null || amount.compareTo(new BigDecimal(0)) <= 0) {
            printer.printMessage("Amount is invalid");
            return;
        }

        BigDecimal currentBalance = customer.getBalance();
        customer.setBalance(currentBalance.add(amount));
        moneyAtm = moneyAtm.add(amount);
    }

    public void displayCustomerInfo(Customer customer) {
        printer.printCustoner(customer);
    }
}
