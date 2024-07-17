package section7_inheritance.lesson79_challenge;

import java.util.Objects;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance < 0) {
            System.out.println("Account balance cannot be negative number");
        } else {
            this.accountBalance = accountBalance;
        }
    }

    public void setCustomerName(String customerName) {
        if (Objects.equals(customerName, "")) {
            System.out.println("Customer name cannot be empty");
        } else {
            this.customerName = customerName;
        }
    }

    public void setEmail(String email) {
        if (Objects.equals(email, "")) {
            System.out.println("Email cannot be empty");
        } else {
            this.email = email;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "BankAccount: " +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'';
    }

    public void printState() {
        System.out.println("BankAccount: " +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'');
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Cannot accept negative amount");
        } else {
            accountBalance += amount;
            System.out.println("Deposit completed successfully.");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > getAccountBalance()) {
            System.out.println("Transaction failed");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawal completed successfully");
        }
    }
}
