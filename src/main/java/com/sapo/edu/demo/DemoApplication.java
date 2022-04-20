package com.sapo.edu.demo;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account: ");
        String account = scanner.nextLine();
        System.out.println("Enter pin: ");
        String pin = scanner.nextLine();
        System.out.println("Enter balance: ");
        String balance = scanner.nextLine();
        Customer customer = new Customer(account, pin, new BigDecimal(balance));

        //Demo function
        Atm bidvAtm = new BidvAtm();
        bidvAtm.printCurrentMoney();
        bidvAtm.displayCustomerInfo(customer);
        bidvAtm.withDraw(customer, new BigDecimal(200000));
        bidvAtm.printCurrentMoney();
        bidvAtm.withDraw(customer, new BigDecimal(10000000));
        bidvAtm.printCurrentMoney();
        bidvAtm.deposit(customer,new BigDecimal(1000000));
        bidvAtm.printCurrentMoney();
    }
}
