package Javamethod.LevelThree;

import java.util.Random;

public class MatrixOperation {
    public static int[][] createRandomMatrix(int rows,int cols){
        Random r = new Random();
        int[][] mat = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                mat[i][j] = r.nextInt(10);
        return mat;
    }

    public static int[][] addMatrices(int[][] a,int[][] b){
        int[][] res = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                res[i][j] = a[i][j]+b[i][j];
        return res;
    }

    public static int[][] subtractMatrices(int[][] a,int[][] b){
        int[][] res = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                res[i][j] = a[i][j]-b[i][j];
        return res;
    }

    public static int[][] multiplyMatrices(int[][] a,int[][] b){
        int[][] res = new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b[0].length;j++)
                for(int k=0;k<b.length;k++)
                    res[i][j]+=a[i][k]*b[k][j];
        return res;
    }

    public static void displayMatrix(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] A = createRandomMatrix(2,2);
        int[][] B = createRandomMatrix(2,2);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);
        System.out.println("Addition:");
        displayMatrix(addMatrices(A,B));
        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(A,B));
        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrices(A,B));
    }
}

