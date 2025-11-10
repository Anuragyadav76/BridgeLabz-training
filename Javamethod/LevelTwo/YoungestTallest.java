package Javamethod.LevelTwo;

import java.util.Scanner;

public class YoungestTallest {
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
        }
        return minIndex;
    }
    public static int findTallest(int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
        System.out.println("Youngest: " + friends[youngestIndex] + " Age=" + ages[youngestIndex]);
        System.out.println("Tallest: " + friends[tallestIndex] + " Height=" + heights[tallestIndex]);
        sc.close();
    }
}

