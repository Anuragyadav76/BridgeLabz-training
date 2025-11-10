import java.util.Scanner;

public class Program7 {
    public static String customTrim(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String trimmed = customTrim(text);
        System.out.println("Custom Trim: '" + trimmed + "'");
        System.out.println("Built-in Trim: '" + text.trim() + "'");
    }
}

