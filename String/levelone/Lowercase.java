import java.util.Scanner;

public class Lowercase {

    static String toLowerCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32); 
            }
            result += c;
        }
        return result;
    }

    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = toLowerCaseManual(text);
        String builtin = text.toLowerCase();

        System.out.println("Manual Lowercase: " + manual);
        System.out.println("Built-in Lowercase: " + builtin);
        System.out.println("Are they equal? " + compareUsingCharAt(manual, builtin));
    }
}

