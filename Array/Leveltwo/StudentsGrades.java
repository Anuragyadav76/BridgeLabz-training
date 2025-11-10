package Array.Leveltwo;

import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            phy[i] = sc.nextInt();
            chem[i] = sc.nextInt();
            math[i] = sc.nextInt();

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 40) grade[i] = 'D';
            else grade[i] = 'F';
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                               " | Phy: " + phy[i] +
                               " | Chem: " + chem[i] +
                               " | Math: " + math[i] +
                               " | %: " + percent[i] +
                               " | Grade: " + grade[i]);
        }

        sc.close();
    }
}

