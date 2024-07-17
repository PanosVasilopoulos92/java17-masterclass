package section10_lists.lesson144_challenge;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Panos", 1000d, new ArrayList<>());
        Customer customer2 = new Customer("Angeliki", 4000d, new ArrayList<>());
        Customer customer3 = new Customer("Efraim", 4000d, new ArrayList<>());
        Customer customer4 = new Customer("John", 2000d, new ArrayList<>());

        System.out.println(customer1.getTransactions());
        System.out.println(customer1.getAccountBalance());

        Bank bank = new Bank("FreeBank", new ArrayList<>());
        System.out.println(bank.getCustomers());
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);
        bank.addCustomer(customer4);
        System.out.println(bank.getCustomers());

        bank.makeTransaction(customer2, 8_000);
        bank.makeTransaction(customer2, -100);

        bank.displayTransactions(customer2);
        System.out.println(customer2.getAccountBalance());
    }
}
