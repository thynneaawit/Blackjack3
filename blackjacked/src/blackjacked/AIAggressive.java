package blackjacked;

import java.util.Scanner;

public class AIAggressive extends OnePlayer {

	public AIAggressive(String name) {
		super(name);
	}

	@Override
	public boolean isHitting(Scanner one) {
		if(getValue() < 17 && isBusted == false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	}
