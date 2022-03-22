package blackjacked;

import java.util.Random;
public class Deck extends CollectionofCards1{
Random rand = new Random();
private static Deck _instance= null;

	public Deck() {
		super(52);
		populateDeck();
	}
	
	public static Deck instance() {
		if(_instance==null) {
		_instance = new Deck();	
		}
		return _instance;
	}

	public void draw(Hand h) {
		int r = rand.nextInt(cards.size());
		h.addCard(cards.get(r));
		cards.remove(r);
	}
	
	public void shuffleDeck() {
		populateDeck();
	}
	
	public void populateDeck() {
		cards.clear();
		String[] suits = {"d", "c", "s", "h"};
		int[] values= {2,3,4,5,6,7,8,9,10,10,10,10,1};
		String[] card = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				String s = card[j]+suits[i];
				addCard(new Card(values[j],s));
			}
		}
	}
}
