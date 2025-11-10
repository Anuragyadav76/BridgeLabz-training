import java.util.Scanner;

public class NumberFormat {

    static void generateException(String text) {
        int num = Integer.parseInt(text); 
        System.out.println("Converted Number: " + num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text = sc.nextLine();

        
        handleException(text);
    }
}
