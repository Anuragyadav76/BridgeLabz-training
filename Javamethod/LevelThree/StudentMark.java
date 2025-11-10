package Javamethod.LevelThree;

import java.util.Scanner;

public class StudentMark {
    public static int[][] generateScores(int n){
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0] = (int)(Math.random()*90)+10;
            arr[i][1] = (int)(Math.random()*90)+10;
            arr[i][2] = (int)(Math.random()*90)+10;
        }
        return arr;
    }

    public static double[][] calculateTotalAveragePercent(int[][] arr){
        double[][] result = new double[arr.length][3];
        for(int i=0;i<arr.length;i++){
            int total = arr[i][0]+arr[i][1]+arr[i][2];
            double avg = Math.round(total/3.0*100.0)/100.0;
            double percent = Math.round(total/3.0*100.0)/100.0;
            result[i][0] = total; result[i][1] = avg; result[i][2] = percent;
        }
        return result;
    }

    public static void displayScoreCard(int[][] scores,double[][] result){
        System.out.println("Physics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for(int i=0;i<scores.length;i++){
            System.out.print(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t");
            System.out.print(result[i][0]+"\t"+result[i][1]+"\t"+result[i][2]);
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        int[][] scores = generateScores(n);
        double[][] result = calculateTotalAveragePercent(scores);
        displayScoreCard(scores,result);
    }
}

