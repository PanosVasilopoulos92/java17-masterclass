package section16.challenge231.lpa;

import section16.challenge231.bank.BankAccount;
import section16.challenge231.bank.BankCustomer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        BankAccount account =
//                new BankAccount(BankAccount.AccountType.CHECKING, 500);
//        System.out.println(account);

        BankCustomer Panos = new BankCustomer("Panos", 500.00, 10000.00);
        System.out.println(Panos);

        List<BankAccount> accounts = Panos.getAccounts();
        accounts.clear();
        System.out.println(Panos);

    }
}