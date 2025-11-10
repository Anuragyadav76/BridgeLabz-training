import java.util.Scanner;

public class FibonacciSeries {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    
    public static void fibonacciIterative(int n) {
        int a = 0, b = 1, c;
        System.out.print("Iterative: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Iterative
        fibonacciIterative(n);

        // Recursive
        System.out.print("Recursive: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }
}
