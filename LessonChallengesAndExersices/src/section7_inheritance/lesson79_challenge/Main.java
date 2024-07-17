package section7_inheritance.lesson79_challenge;

public class Main {

    public static void main(String[] args) {
        BankAccount panosAccount = new BankAccount();
        panosAccount.setAccountNumber(1);
        panosAccount.setAccountBalance(-10_000);
        panosAccount.setCustomerName("Panos");
        panosAccount.setEmail("panos@gmail.com");

        panosAccount.setAccountBalance(10_000);
        panosAccount.printState();

        panosAccount.deposit(1000);
        panosAccount.printState();

        panosAccount.withdraw(250000);
        panosAccount.printState();

        BankAccount account2 = new BankAccount();
        account2.printState();

        panosAccount.printState();
    }
}
