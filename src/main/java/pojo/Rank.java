package pojo;

/**
 * Created by andrzej on 29.08.17.
 */
public enum Rank {

		DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

		private int rankPoints;

		Rank(int rankPoints) {
			this.rankPoints = rankPoints;
		}

		public int getRankPoints() {
			return rankPoints;
		}
	}

