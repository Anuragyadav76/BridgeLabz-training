package DesignPrinciple;
import java.util.*;

class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    String bankName;
    List<Customer> customers = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c, double initialDeposit) {
        c.deposit(initialDeposit);
        customers.add(c);
        System.out.println(c.name + " opened an account in " + bankName);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");

        Customer c1 = new Customer("Anurag");
        Customer c2 = new Customer("Rahul");

        bank.openAccount(c1, 1000);
        bank.openAccount(c2, 2000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
