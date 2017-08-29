package pojo;

import pojo.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by andrzej on 29.08.17.
 */
public class Deck {

	private List<Card> listOfCarts;

	public List<Card> initializeTheDeck() {

		listOfCarts = new ArrayList<>();

		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {

				listOfCarts.add(new Card(r, s));
			}
		}
		return listOfCarts;
	}

	public List<Card> shuffleCards(List<Card> list) {

		Collections.shuffle(list);

		return list;
	}
}
