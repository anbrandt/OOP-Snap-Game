import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pojo.Card;
import pojo.Deck;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 29.08.17.
 */
public class DeckTest {

	private Deck deck;

	@Before
	public void setUp() {
		deck = new Deck();

	}


	@Test
	public void deckSizeShouldBe52() {
		//given
		List<Card> cards = deck.initializeTheDeck();

		//when


		//then
		assertEquals(52, cards.size());
	}

	@Test
	public void deckShouldNotContainTheSameCard() {
		//given
		List<Card> cards = deck.initializeTheDeck();
		//when
		for (Card card : cards) {
		}
	}

		//then







}