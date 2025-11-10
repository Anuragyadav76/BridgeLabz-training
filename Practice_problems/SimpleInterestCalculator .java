import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the Principal amount: ");
        float principal = scanner.nextFloat();

        System.out.print("Enter the Rate of interest: ");
        float rate = scanner.nextFloat();

        System.out.print("Enter the Time (in years): ");
        float time = scanner.nextFloat();

        
        float simpleInterest = (principal * rate * time) / 100;

        
        System.out.printf("The Simple Interest is: %.2f%n", simpleInterest);

        scanner.close();
    }
}


