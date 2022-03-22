package blackjacked;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Deck d = new Deck();

System.out.println("Welcome to Blackjack!");

System.out.println("How many players?");
int numberOfPlayers = input.nextInt();
ArrayList<OnePlayer> players = new ArrayList<>(numberOfPlayers+1);
for(int i = 0; i < numberOfPlayers; i++) {
	System.out.printf("Enter player #%d name:", i+1);
	String name = input.next();
	Player one = new Player(name);
	players.add(one);
}
System.out.println("How many AI players?");
int numberOfAIPlayers = input.nextInt();
Random name = new Random();
for(int i = 0; i < numberOfAIPlayers; i++) {
	System.out.printf("Enter AI player #%d name: ", i+1);
	String AIname = input.next();
	if(name.nextInt(2) ==0) {
		AIAggressive AIplayer = new AIAggressive(AIname);
		players.add(AIplayer);
	}
	else {
	AIConservative AIplayer = new AIConservative(AIname);
	players.add(AIplayer);
	}
}
House h = new House();
players.add(h);
for(int i = 0; i < players.size(); i++) {
	OnePlayer p = players.get(i);
	d.draw(p);
	d.draw(p);
	if(p instanceof House) {
		House house = (House) p;
		house.flipFirstCard();
	}
	System.out.printf("%s", p);
}
for(int i = 0; i < players.size(); i++) {
	OnePlayer p = players.get(i);
	if(p instanceof House) {
		House house = (House) p;
		house.flipFirstCard();
	}
	while(!p.isBusted()) {
		if(p.isHitting(input)) {
		d.draw(p);
		System.out.printf("%s", p);
		}
		else {
			break;
		}
		if(p.getValue() > 21) {
			p.busted();
		}
	}
}
System.out.println("Final Hands:");
for(int i = 0; i < players.size(); i++) {
	OnePlayer p = players.get(i);
	System.out.printf("%s", p);
}
System.out.printf("%n%n");
int houseValue = h.getValue();
for(int i = 0; i < players.size();i++) {
	OnePlayer p = players.get(i);
	if(p instanceof House) {
		continue;
	}
	if(!p.isBusted() && houseValue > 21) {
		p.win();
	}
	else if(p.getValue() == houseValue && !p.isBusted()) {
		p.push();
	}
	else if(!p.isBusted() && p.getValue()> houseValue) {
		p.win();
	}
	else {
		p.lose();
	}
}
	}

}