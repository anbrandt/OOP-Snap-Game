package pojo;

/**
 * Created by andrzej on 29.08.17.
 */
public enum Suit {
	CLUBS(2), DIAMONDS(3), HEARTS(4), SPADES(5);

	private int suitPoints;

	Suit(int suitPoints) {
		this.suitPoints = suitPoints;
	}

	public int getSuitPoints() {
		return suitPoints;
	}


}
