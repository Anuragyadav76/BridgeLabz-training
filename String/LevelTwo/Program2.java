import java.util.Scanner;

public class Program2 {
    public static String[] customSplit(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        String[] words = new String[count];
        int wordIndex = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                words[wordIndex++] = word;
                word = "";
            }
        }
        words[wordIndex] = word;
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userSplit = customSplit(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Custom Split:");
        for (String w : userSplit) System.out.println(w);

        System.out.println("Built-in Split:");
        for (String w : builtInSplit) System.out.println(w);

        System.out.println("Both same? " + compareArrays(userSplit, builtInSplit));
    }
}

