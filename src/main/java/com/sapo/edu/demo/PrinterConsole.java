package com.sapo.edu.demo;

public class PrinterConsole {
    public void printCustoner(Customer customer) {
        System.out.println("CustomerId: " + customer.getAcctNo() + ", balance: " + customer.getBalance().toString());
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
