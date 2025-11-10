package Levelthree;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int math = sc.nextInt();

        double average = (phy + chem + math) / 3.0;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (average >= 75) {
            System.out.println("Grade: A (Very Good)");
        } else if (average >= 60) {
            System.out.println("Grade: B (Good)");
        } else if (average >= 40) {
            System.out.println("Grade: C (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        sc.close();
    }
}

