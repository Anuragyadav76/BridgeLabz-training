import java.util.Scanner;

public class Countdownfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launched!");
    }
}

