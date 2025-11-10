import java.util.Scanner;

public class StringIndex{

    static void generateException(String text) {
        System.out.println(text.charAt(text.length())); 
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        

        handleException(text);
    }
}
