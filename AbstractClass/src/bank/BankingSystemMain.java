package bank;

public class BankingSystemMain {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SAV123", "Anurag Yadav", 8000),
            new CurrentAccount("CUR456", "Rahul Singh", 15000)
        };

        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: ₹" + interest);

            acc.deposit(2000);
            acc.withdraw(1000);
            System.out.println("Updated Balance: ₹" + acc.getBalance());

            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                l.applyForLoan(5000);
            }

            System.out.println("-----------------------------------");
        }
    }
}
