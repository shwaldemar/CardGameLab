import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
        standard52();
        shuffleCards();
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    private void standard52() {
        for (SuitType suit: SuitType.values()) {

            for (RankType rank: RankType.values()) {
                Card card = new Card(suit, rank);
                addCard(card);
            }
        }
        // Loop through each suit in the suit enum
            // For each suit loop through the rank in the rank enum
                // For each rank create a card with the current suit and rank
                // Add that suit into the deck using addCard()
            // End value loop
        // End suit loop



    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
       return this.cards.remove(0);
    }
}
