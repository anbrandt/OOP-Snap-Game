package CPUplayers;

import pojo.Card;

import java.util.List;

/**
 * Created by andrzej on 29.08.17.
 */
public class CPUplayer implements PlayerInterface {

	private List<Card> cards;
	private String playerName;

	public CPUplayer(List<Card> cards, String playerName) {
		this.cards = cards;
		this.playerName = playerName;
	}

	public List<Card> getCards() {
		return cards;
	}

	@Override
	public String toString() {
		return "CPUplayer{" +
				"cards=" + cards +
				", playerName='" + playerName + '\'' +
				'}';
	}



	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public void addCard(Card card) {
		cards.add(card);
	}

	@Override
	public void addCards(List<Card> cards) {
		cards.forEach(this::addCard);
	}

	@Override
	public String getName() {
		return this.playerName;
				}

	@Override
	public int cardNumber() {
		return cards.size();
	}
}
