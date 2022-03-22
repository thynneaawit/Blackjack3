package blackjacked;

public class PlayerFactory {

	public PlayerFactory() {
		
	}
	
	public OnePlayer produce(String type, String name) {
		if(type.equals("Player")) {
			return new Player(name);
		}
		else if(type.equals("House")) {
			return new House();
		}
		else {
			return null;
		}
	}

}

