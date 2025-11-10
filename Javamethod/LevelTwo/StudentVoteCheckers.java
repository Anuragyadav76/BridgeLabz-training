package Javamethod.LevelTwo;
import java.util.Scanner;

public class StudentVoteCheckers {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < ages.length; i++) {
            boolean result = canStudentVote(ages[i]);
            if (result) System.out.println("Student " + (i + 1) + " CAN vote");
            else System.out.println("Student " + (i + 1) + " CANNOT vote");
        }
        sc.close();
    }
}

