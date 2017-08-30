package CPUplayers;

import pojo.Card;

import java.util.List;

/**
 * Created by andrzej on 29.08.17.
 */
public interface PlayerInterface {

	void addCard(Card card);
	void addCards(List<Card> cards);
	int cardNumber();
	String getName();



}
