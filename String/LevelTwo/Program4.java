import java.util.Scanner;

public class Program4 {
    public static String[] customSplit(String text) {
        return text.split(" ");
    }

    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[] result = findShortestAndLongest(words);

        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}

