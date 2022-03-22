package blackjacked;

import java.util.Scanner;
public abstract class OnePlayer extends Hand {
protected String name;
protected boolean isBusted = false;
protected OnePlayer(String name) {
	super();
	this.name = name;
	}
public abstract boolean isHitting(Scanner s);

public boolean isBusted() {
	return this.isBusted;
}


public void busted() {
	System.out.printf("%s Busted!%n", name);
	isBusted = true;
}

public String toString() {
	return String.format("%s: %s", name, super.toString());
}
public  void win() {
	System.out.printf("%s Wins! %n", name);
}

public void lose() {
	System.out.printf("%s Loses %n", name);
}
public void push() {
	System.out.printf("%s Pushed %n", name);
}

	


}
