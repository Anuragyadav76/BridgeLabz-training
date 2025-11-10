import java.util.Scanner;

public class Program6 {
    public static String checkType(char ch) {
        ch = Character.toLowerCase(ch);
        if (Character.isLetter(ch)) {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println(ch + "\t" + checkType(ch));
        }
    }
}

