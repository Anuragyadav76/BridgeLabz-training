package Javamethod.LevelThree;

public class EmployeeBonus {
    public static double[][] generateSalaryYears() {
        double[][] arr = new double[10][2];
        for(int i=0;i<10;i++){
            arr[i][0] = (int)(Math.random()*90000)+10000;
            arr[i][1] = (int)(Math.random()*10)+1;
        }
        return arr;
    }

    public static double[][] calculateBonus(double[][] arr) {
        double[][] newArr = new double[10][3];
        for(int i=0;i<10;i++){
            double bonus = arr[i][1]>5 ? arr[i][0]*0.05 : arr[i][0]*0.02;
            newArr[i][0] = arr[i][0];
            newArr[i][1] = bonus;
            newArr[i][2] = arr[i][0]+bonus;
        }
        return newArr;
    }

    public static void displayTotals(double[][] arr){
        double sumOld=0,sumBonus=0,sumNew=0;
        for(int i=0;i<10;i++){
            sumOld += arr[i][0]; sumBonus += arr[i][1]; sumNew += arr[i][2];
        }
        System.out.println("Old Salary\tBonus\tNew Salary");
        for(int i=0;i<10;i++) System.out.println(arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]);
        System.out.println("Total\t"+sumBonus+"\t"+sumNew);
    }

    public static void main(String[] args){
        double[][] arr = generateSalaryYears();
        double[][] newArr = calculateBonus(arr);
        displayTotals(newArr);
    }
}
