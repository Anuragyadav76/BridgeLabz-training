import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the cylinder: ");
        float radius = scanner.nextFloat();

        System.out.print("Enter the height of the cylinder: ");
        float height = scanner.nextFloat();

        
        float pi = 3.14159f;

        
        float volume = pi * radius * radius * height;

        
        System.out.printf("The volume of the cylinder is: %.2f cubic units%n", volume);

        scanner.close();
    }
}

