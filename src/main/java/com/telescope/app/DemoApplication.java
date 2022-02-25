package com.telescope.app;

import com.telescope.app.model.Customer;
import com.telescope.app.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    private final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    private final CustomerRepository repository;

    public DemoApplication(CustomerRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        queryAllCustomers();
        createCustomer();
        queryAllCustomers();
    }

    private void createCustomer() {
        Customer newCustomer = new Customer();
        newCustomer.setFirstName("John");
        newCustomer.setLastName("Doe");
        logger.info("Saving new customer...");
        this.repository.save(newCustomer);
    }

    private void queryAllCustomers() {
        List<Customer> allCustomers = this.repository.findAll();
        logger.info(String.format("Number of customers: %d", allCustomers.size()));
    }

}
