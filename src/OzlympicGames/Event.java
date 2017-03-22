package OzlympicGames;

import java.util.ArrayList;
import java.util.Random;

public class Event {

	public void Event(ArrayList<Athlete> comp) { //This is how to iterate over the COMP arraylist
		for(int i = 0; i < comp.size(); i++) {
			System.out.println(comp.get(i)); //This currently just returns the Athlete arraylist, comp
			
		}
		Athlete random = comp.get(new Random().nextInt(comp.size())); //Selects random winner
		random.setScore(0);//Sets score
		System.out.println(random.getName() + random.getScore());
		
	}
	
	
}
