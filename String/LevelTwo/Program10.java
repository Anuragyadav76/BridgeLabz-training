import java.util.Random;

public class Program10 {
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) marks[i][j] = 30 + rand.nextInt(71);
        }
        return marks;
    }

    public static void calculateResults(int[][] marks) {
        System.out.println("Phy\tChem\tMath\tTotal\t% \tGrade");
        for (int[] m : marks) {
            int total = m[0] + m[1] + m[2];
            double percent = total / 3.0;
            String grade = (percent >= 90) ? "A" :
                           (percent >= 75) ? "B" :
                           (percent >= 50) ? "C" : "D";
            System.out.println(m[0] + "\t" + m[1] + "\t" + m[2] + "\t" +
                               total + "\t" + Math.round(percent) + "\t" + grade);
        }
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5);
        calculateResults(marks);
    }
}
