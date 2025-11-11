class BankAccount {
    int accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;
    void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;
    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Maturity Period: " + maturityPeriod + " years");
    }
}

public class Main8 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.interestRate = 4.5;
        CheckingAccount c = new CheckingAccount();
        c.withdrawalLimit = 50000;
        FixedDepositAccount f = new FixedDepositAccount();
        f.maturityPeriod = 5;
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}

