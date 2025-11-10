package Array.Leveltwo;
 import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            marks[i][0] = sc.nextInt(); // physics
            marks[i][1] = sc.nextInt(); // chemistry
            marks[i][2] = sc.nextInt(); // maths

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 40) grade[i] = 'D';
            else grade[i] = 'F';
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                               " | Phy: " + marks[i][0] +
                               " | Chem: " + marks[i][1] +
                               " | Math: " + marks[i][2] +
                               " | %: " + percent[i] +
                               " | Grade: " + grade[i]);
        }

        sc.close();
    }
}

