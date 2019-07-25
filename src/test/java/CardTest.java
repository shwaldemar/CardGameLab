import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.DIAMONDS, RankType.FOUR);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.DIAMONDS, card.getSuit());
    }

    @Test
    public void canGetRankType() {
        assertEquals(RankType.FOUR, card.getRank());
    }

    @Test
    public void fourHasValueOf4() {
        assertEquals(4, card.getValueFromEnum());
    }

}
