package Constructors;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1001, "Anurag", 5000, 5);
        s.display();
        s.displayDetails();
        s.deposit(2000);
        s.withdraw(1000);
        System.out.println("Final Balance: " + s.getBalance());
    }
}
