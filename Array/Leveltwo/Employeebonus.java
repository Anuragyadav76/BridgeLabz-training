package Array.Leveltwo;
import java.util.Scanner;

public class Employeebonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("Invalid salary! Enter again.");
                i--;
                continue;
            }

            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            years[i] = sc.nextDouble();
            if (years[i] < 0) {
                System.out.println("Invalid years of service! Enter again.");
                i--;
                continue;
            }
        }

        // Calculation
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i]; // 5%
            } else {
                bonus[i] = 0.02 * salary[i]; // 2%
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\nEmployee Wise Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                               " | Old Salary: " + salary[i] +
                               " | Bonus: " + bonus[i] +
                               " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}

