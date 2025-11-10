package Leveltwo;
import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ages
        System.out.print("Enter Amar's Age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter Akbar's Age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter Anthony's Age: ");
        int age3 = sc.nextInt();

        // Heights
        System.out.print("Enter Amar's Height: ");
        int h1 = sc.nextInt();
        System.out.print("Enter Akbar's Height: ");
        int h2 = sc.nextInt();
        System.out.print("Enter Anthony's Height: ");
        int h3 = sc.nextInt();

        // Youngest
        if (age1 < age2 && age1 < age3)
            System.out.println("Amar is the youngest.");
        else if (age2 < age1 && age2 < age3)
            System.out.println("Akbar is the youngest.");
        else
            System.out.println("Anthony is the youngest.");

        // Tallest
        if (h1 > h2 && h1 > h3)
            System.out.println("Amar is the tallest.");
        else if (h2 > h1 && h2 > h3)
            System.out.println("Akbar is the tallest.");
        else
            System.out.println("Anthony is the tallest.");

        sc.close();
    }
}
