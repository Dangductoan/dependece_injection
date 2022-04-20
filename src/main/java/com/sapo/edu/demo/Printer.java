package com.sapo.edu.demo;

public interface Printer {
    void printCustomer(Customer customer);

    void printMessage(String message);
    void printError(String error);
    void printWarn(String warn);
}
