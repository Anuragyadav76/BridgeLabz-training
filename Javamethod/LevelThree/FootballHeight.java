package Javamethod.LevelThree;

import java.util.*;

public class FootballHeight {
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }
    public static double findMean(int[] arr) {
        return (double)findSum(arr) / arr.length;
    }
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}

