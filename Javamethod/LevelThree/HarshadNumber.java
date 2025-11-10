package Javamethod.LevelThree;

import java.util.*;

public class HarshadNumber {
    public static boolean isHarshad(int num) {
        int sum = 0, n = num;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return num % sum == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isHarshad(num));
        sc.close();
    }
}
