import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.SPADES, RankType.FIVE);
    }

//    @Test
//    public void deckStartsEmpty() {
//        assertEquals(0, deck.cardCount());
//    }

//    @Test
//    public void canAddCard() {
//        deck.addCard(card);
//        assertEquals(1, deck.cardCount());
//    }

    @Test
    public void standard52Has52() {
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canDealCard() {
        Card card = deck.dealCard();
        assertEquals(51, deck.cardCount());
        assertNotNull(card);
    }

}
