package com.sapo.edu.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer("ABC", "1234", new BigDecimal(5000000));

        Atm atm = new Atm();
        atm.printCurrentMoney();
        atm.displayCustomerInfo(customer);
        atm.withDraw(customer, new BigDecimal(200000));
        atm.printCurrentMoney();
        atm.withDraw(customer, new BigDecimal(10000000));
        atm.printCurrentMoney();
        atm.deposit(customer,new BigDecimal(1000000));
        atm.printCurrentMoney();
    }
}
