package Object.Leveltwo;



class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Rohan";
        acc.accountNumber = 1234567890L;
        acc.balance = 5000;
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}

