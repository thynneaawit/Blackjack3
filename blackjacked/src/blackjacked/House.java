package blackjacked;

import java.util.Scanner;

public class House extends OnePlayer{

	public House() {
		super("House");
	}
	
	public void Bet(Scanner s) {
		
	}
	

	public boolean isHitting(Scanner one) {
		if(getValue() < 16 && isBusted == false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void flipFirstCard() {
		cards.get(0).Flip();
	}

}

