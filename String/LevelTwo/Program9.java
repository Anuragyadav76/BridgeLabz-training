import java.util.*;

public class Program9 {
    public static String computerChoice() {
        String[] options = {"Rock", "Paper", "Scissors"};
        return options[(int) (Math.random() * 3)];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0;

        System.out.print("How many games? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String user = sc.nextLine();
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            System.out.println("Game " + i + ": You - " + user + " | Computer - " + comp + " | Winner - " + winner);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + (n - userWins - compWins));
    }
}

