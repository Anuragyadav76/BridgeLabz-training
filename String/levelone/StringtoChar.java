import java.util.Scanner;

public class StringtoChar {

    
    static char[] toCharArrayManual(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    
    static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] arr1 = toCharArrayManual(text);
        char[] arr2 = text.toCharArray();

        System.out.print("Manual Char Array: ");
        for (char c : arr1) System.out.print(c + " ");
        System.out.println();

        System.out.print("Built-in Char Array: ");
        for (char c : arr2) System.out.print(c + " ");
        System.out.println();

        boolean result = compareCharArrays(arr1, arr2);
        System.out.println("Comparison Result: " + result);
    }
}

