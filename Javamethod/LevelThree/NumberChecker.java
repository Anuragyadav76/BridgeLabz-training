package Javamethod.LevelThree;

import java.util.*;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) if (d == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }
    public static int[] findLargestSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }
        return new int[]{max1, max2};
    }
    public static int[] findSmallestSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }
        return new int[]{min1, min2};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number: " + isDuckNumber(num));
        System.out.println("Armstrong Number: " + isArmstrong(num));
        System.out.println("Largest & 2nd Largest: " + Arrays.toString(findLargestSecondLargest(digits)));
        System.out.println("Smallest & 2nd Smallest: " + Arrays.toString(findSmallestSecondSmallest(digits)));
        sc.close();
    }
}
