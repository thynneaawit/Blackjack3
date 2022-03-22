package blackjacked;

import java.util.Scanner;

public class Player extends OnePlayer{
	public Player(String name) {
		super(name);
	}
	
	public  void win() {
		System.out.printf("%s Wins!%n", name);
	}

	public void lose() {
		System.out.printf("%s Loses%n", name);
	}
	
	public void push() {
		System.out.printf("%s Pushed%n", name);
	}
	
	public boolean isHitting(Scanner s) {
		do {
			System.out.printf("%n%s: Do you want to hit (y/n)? ", name);
			String response = s.next();
			if(response.length()==0) {
				continue;
			}
			if(response.charAt(0)=='y') {
				return true;
			}
			else if(response.charAt(0)=='n') {
				return false;
			}
			else {
				System.out.println("Please Respond with yes or no");
			}
		}while(true);
	}
	}

