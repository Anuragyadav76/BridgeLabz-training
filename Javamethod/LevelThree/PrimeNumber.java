package Javamethod.LevelThree;

import java.util.*;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        printPrimes(start, end);
        sc.close();
    }
}

