package section10_lists.lesson144_challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        if (customers.contains(customer)) {
            System.out.println("Customer already exists.");
        } else {
            customers.add(customer);
            System.out.println("Customer successfully added.");
        }
    }

    public void makeTransaction(Customer customer, double amount){
        if (customers.contains(customer)) {
            customer.makeTransaction(customer.getName(), amount); // will not check negative account balances.
            System.out.printf("Customer %s has a new transaction in his bank account.\n", customer.getName());
        }
    }

    public void displayTransactions(Customer customer){
        System.out.println(customer.getTransactions());
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                "customers=" + customers +
                '}';
    }
}
