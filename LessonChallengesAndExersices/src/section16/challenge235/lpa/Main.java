package section16.challenge235.lpa;

import section16.challenge235.bank.Bank;
import section16.challenge235.bank.BankAccount;
import section16.challenge235.bank.BankCustomer;

public class Main {

    public static void main(String[] args) {

//        BankAccount account =
//                new BankAccount(BankAccount.AccountType.CHECKING, 500);
//        System.out.println(account);

//        BankCustomer Panos = new BankCustomer("Joe", 500.00,
//                10000.00);
//        System.out.println(Panos);

        Bank bank = new Bank(3214567);
        bank.addCustomer("Panos", 500.00,
        10000.00);

        BankCustomer Panos = bank.getCustomer("000000010000000");
        System.out.println(Panos);

        if (bank.doTransaction(Panos.getCustomerId(), BankAccount.AccountType.CHECKING,
                35)) {
            System.out.println(Panos);
        }

        if (bank.doTransaction(Panos.getCustomerId(), BankAccount.AccountType.CHECKING,
                -535)) {
            System.out.println(Panos);
        }

        BankAccount checking = Panos.getAccount(BankAccount.AccountType.CHECKING);
        var transactions = checking.getTransactions();
        transactions.forEach((k, v) -> System.out.println(k + ": " + v));

//        System.out.println("------------------");
//        for (var tx : transactions.values()) {
//            tx.setCustomerId(2);
//            tx.setAmount(10000.00);
//        }
//        transactions.forEach((k, v) -> System.out.println(k + ": " + v));

        Panos.getAccount(BankAccount.AccountType.CHECKING).getTransactions().clear();
        System.out.println("------------------");
        Panos.getAccount(BankAccount.AccountType.CHECKING).getTransactions()
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }
}