package section10_lists.lesson144_challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double accountBalance;
    private ArrayList<Double> transactions;

    public Customer(String name, double accountBalance, ArrayList<Double> transactions) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void makeTransaction(String name, double amount) {
        this.accountBalance += amount;
        transactions.add(amount);
    }

    @Override
    public String toString() {
        return "Customer: " +
                "name='" + name + '\'' +
                ", accountBalance=" + accountBalance +
                ", transactions=" + transactions +
                "\n";
    }
}
