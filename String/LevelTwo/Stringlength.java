import java.util.Scanner;

public class Stringlength {
    

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (Exception e) {
            return count; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

    
        int myLength = findLength(input);

        
        int builtInLength = input.length();

        
        System.out.println("Length using user-defined method: " + myLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

    
        if (myLength == builtInLength) {
            System.out.println("✅ Both results are same!");
        } else {
            System.out.println("❌ Results are different!");
        }

        sc.close();
    }
}
