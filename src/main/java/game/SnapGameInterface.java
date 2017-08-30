package game;

import CPUplayers.CPUplayer;
import pojo.Card;

/**
 * Created by andrzej on 29.08.17.
 */
public interface SnapGameInterface {

	 boolean opponentHasMoreCards();
	 Card getNextCard();
	 CPUplayer getSnapPlayer();
	 boolean isDraw();
	 CPUplayer getWinner();

}
