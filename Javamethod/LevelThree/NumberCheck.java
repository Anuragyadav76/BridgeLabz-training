package Javamethod.LevelThree;

import java.util.Scanner;

public class NumberCheck {

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] arr = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) arr[index++] = i;
        return arr;
    }

    public static int greatestFactor(int[] arr) {
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;
        return max;
    }

    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    public static long productOfFactors(int[] arr) {
        long prod = 1;
        for (int i : arr) prod *= i;
        return prod;
    }

    public static long productOfCubeFactors(int[] arr) {
        long prod = 1;
        for (int i : arr) prod *= Math.pow(i, 3);
        return prod;
    }

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] f = factors(n);
        System.out.println("Factors: ");
        for (int x : f) System.out.print(x + " ");
        System.out.println("\nGreatest Factor: " + greatestFactor(f));
        System.out.println("Sum of Factors: " + sumOfFactors(f));
        System.out.println("Product of Factors: " + productOfFactors(f));
        System.out.println("Product of Cubes of Factors: " + productOfCubeFactors(f));
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));

        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.print("Generated OTPs: ");
        for (int otp : otps) System.out.print(otp + " ");
        System.out.println("\nAll OTPs unique: " + areUnique(otps));
    }
}
