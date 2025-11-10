package Leveltwo;
import java.util.Scanner;

public class MultipliesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        int counter = 100;

        if (number > 0 && number < 100) {
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Number must be positive and < 100!");
        }
        sc.close();
    }
}

