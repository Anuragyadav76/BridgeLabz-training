package Javamethod.LevelThree;

import java.util.Scanner;

public class Digit {

    public static int countDigits(int number) {
        int count = 0;
        int n = Math.abs(number);
        if (n == 0) return 1;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int n = Math.abs(number);
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        int power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    public static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static int findSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int findSecondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);
        System.out.println("Number of digits: " + countDigits(number));
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));
        System.out.println("Largest Digit: " + findLargest(digits));
        System.out.println("Second Largest Digit: " + findSecondLargest(digits));
        System.out.println("Smallest Digit: " + findSmallest(digits));
        System.out.println("Second Smallest Digit: " + findSecondSmallest(digits));
    }
}
