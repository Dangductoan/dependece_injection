package com.sapo.edu.demo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("PrinterFiler")
public class PrinterFile implements Printer {
    private static final Logger logger = LogManager.getLogger(PrinterFile.class);
    @Override
    public void printCustomer(Customer customer) {
        System.out.println("CustomerId: " + customer.getAcctNo() + ", balance: " + customer.getBalance().toString());
    }

    @Override
    public void printMessage(String message) {

        logger.info(message);
    }
    @Override
    public void printError(String error) {
        logger.error(error);
    }
    @Override
    public void printWarn(String warn) {
        logger.warn(warn);
    }

}
