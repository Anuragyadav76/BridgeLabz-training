package Array;

public class leader {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 3, 4};
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
    
    
}
