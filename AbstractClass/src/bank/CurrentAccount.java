package bank;

public class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;
    private boolean hasLoan = false;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            hasLoan = true;
            System.out.println("Loan of ₹" + amount + " approved for Current Account: " + getHolderName());
        } else {
            System.out.println("Loan not approved for " + getHolderName());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}
