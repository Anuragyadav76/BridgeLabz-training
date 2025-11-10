import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // Initial Balance

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thanks for using bank!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
    }
}

