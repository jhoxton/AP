package OzlympicGames;

import java.util.ArrayList;
import java.util.Random;

public class Event {
	
	private static String name;
	private static String code;
	private static String winner;
	

	public void Event (ArrayList<Athlete> comp) { //This is how to iterate over the COMP arraylist
		for(int i = 0; i < comp.size(); i++) {
			System.out.println(comp.get(i)); //This currently just returns the Athlete arraylist, comp
		}
		
		Athlete random = comp.get(new Random().nextInt(comp.size())); //Selects random winner
		random.setScore(0);//Sets score
		System.out.println(random.getName() + random.getScore());
		
	}


	public String getName() {	
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
