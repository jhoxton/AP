package OzlympicGames;

import java.util.Random;

public class SuperAthlete extends Athlete {

	public SuperAthlete(int id, String name, int age, int score) {
		super(id, name, age, score);
		// TODO Auto-generated constructor stub				
	}
	@Override
	public int compete(String eventName) { //SuperAthlete objects use string match to determine event type
		//Can I use getters for these?
		
		int maximum = 0;
		int minimum = 0;
		
		if(eventName == "Running Event") {
			maximum = 20;
			minimum = 10;
		} else if (eventName =="Cycling Event") {
			maximum = 800;
			minimum = 500;
		} else if (eventName == "Swimming Event") {
			maximum = 200;
			minimum = 100;
		}	
		
		Random rn = new Random();
		int range = maximum - minimum + 1;
		int time =  rn.nextInt(range) + minimum;
		return time;
		
	}

}
