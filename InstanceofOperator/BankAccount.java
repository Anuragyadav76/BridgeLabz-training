package InstanceofOperator;

class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Account No: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, "Anurag", 5000);
        BankAccount a2 = new BankAccount(102, "Rahul", 7000);
        a1.displayDetails();
        a2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}

