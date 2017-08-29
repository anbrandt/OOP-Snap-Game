package pojo;

/**
 * Created by andrzej on 29.08.17.
 */
public class Card {

	private final Rank rank;
	private final Suit suit;


	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}


	@Override
	public String toString() {
		return "Card{" +
				"rank=" + rank +
				", suit=" + suit +
				'}';
	}
}
