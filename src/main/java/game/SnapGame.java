package game;

import CPUplayers.CPUplayer;
import pojo.Card;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by andrzej on 29.08.17.
 */
public class SnapGame implements SnapGameInterface {

	private List<Card> cardList;
	private List<CPUplayer> cpUplayers;
	private final Random random = new Random();

	public SnapGame(List<Card> cardList, int cardDecks) {
		this.cardList = new LinkedList<>();

	}

	@Override
	public boolean opponentHasMoreCards() {
		return !cardList.isEmpty();
	}

	@Override
	public Card getNextCard() {
			return cardList.remove(0);
	}

	@Override
	public CPUplayer getSnapPlayer() {
		int size = cpUplayers.size();
		return 	cpUplayers.get(random.nextInt(size));
	}

	@Override
	public boolean isDraw() {
		CPUplayer player1 = cpUplayers.get(0);
		CPUplayer player2 = cpUplayers.get(1);
		return player1.cardNumber() == player2.cardNumber();
	}

	@Override
	public CPUplayer getWinner() {
		CPUplayer player1 = cpUplayers.get(0);
		CPUplayer player2 = cpUplayers.get(1);
		return player1.cardNumber() > player2.cardNumber() ? player1 : player2;
	}
}
