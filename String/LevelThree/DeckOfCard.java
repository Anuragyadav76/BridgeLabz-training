import java.util.*;

public class DeckOfCard {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        
        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        
        Collections.shuffle(deck);

        
        for (int i = 0; i < 4; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");
            for (int j = 0; j < 13; j++) {
                System.out.println(deck.get(i * 13 + j));
            }
        }
    }
}
