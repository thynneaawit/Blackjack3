package blackjacked;

import java.util.Scanner;

public class AIConservative extends OnePlayer {

	public AIConservative(String name) {
		super(name);
	}

	@Override
	public boolean isHitting(Scanner one) {
		if(getValue() < 12 && isBusted == false) {
			return true;
		}
		else {
			return false;
		}
	}
	}


