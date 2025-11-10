import java.util.Scanner;

public class CAlenderDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days in month (28–31): ");
        int days = sc.nextInt();

        System.out.print("Enter starting day (0=Sun, 1=Mon, … 6=Sat): ");
        int startDay = sc.nextInt();

        System.out.println("\nSun Mon Tue Wed Thu Fri Sat");

        
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
