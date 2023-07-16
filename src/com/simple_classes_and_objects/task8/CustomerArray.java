package com.simple_classes_and_objects.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerArray {
    private List<Customer> customers;

    public CustomerArray() {
    }

    public CustomerArray(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> sortAlphabetically() {
        return customers.stream()
                .sorted(Comparator.comparing(Customer::getSurname)
                        .thenComparing(Customer::getName))
                .collect(Collectors.toList());
    }

    public List<Customer> sortCreditCardNumberInRange(long begin, long end) {
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : this.customers) {
            if (customer.getCreditCardNumber() >= begin && customer.getCreditCardNumber() <= end)
                customers.add(customer);
        }
        return customers.stream()
                .sorted(Comparator.comparing(Customer::getCreditCardNumber))
                .collect(Collectors.toList());
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return customers + "";
    }
}
