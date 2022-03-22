package blackjacked;

import java.util.ArrayList;

public abstract class CollectionofCards1 {
	protected ArrayList<Card> cards;

	protected CollectionofCards1(int size) {

			this.cards = new ArrayList<>(size);
		}




		public void addCard(Card a) {
			cards.add(a);
		}

		public void removeCard(Card a) {
			cards.remove(a);
		}

	}

