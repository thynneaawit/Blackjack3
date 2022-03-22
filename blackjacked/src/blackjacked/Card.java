package blackjacked;

public class Card {
private int value;
private String card;
private boolean isFlipped = false;

public Card(int value, String card) {
	this.value = value;
	this.card = card;
}

public int getValue() {
	return this.value;
}

public boolean isFlipped() {
	return this.isFlipped;
}

public void Flip() {
	this.isFlipped =!this.isFlipped;
}

public String toString() {
	String output;
	if(isFlipped) {
		output = String.format("XX");
	}
	else {
		output = String.format("%s", this.card);
	}
	return output;
}
}
