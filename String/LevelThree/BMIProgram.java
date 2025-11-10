import java.util.Scanner;

public class BMIProgram {

    
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{
                String.format("%.1f", weight),
                String.format("%.1f", heightCm),
                String.format("%.1f", bmi),
                status
        };
    }


    public static String[][] processBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            result[i] = calculateBMI(hw[i][0], hw[i][1]);
        }
        return result;
    }

    
    public static void display(String[][] data) {
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        System.out.println("Enter weight(kg) and height(cm) of 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight: ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " Height: ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(hw);
        display(result);
    }
}
