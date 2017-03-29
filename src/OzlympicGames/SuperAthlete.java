package OzlympicGames;

import java.util.Random;

public class SuperAthlete extends Athlete {

	public SuperAthlete(int id, String name, int age, int score) {
		super(id, name, age, score);
		// TODO Auto-generated constructor stub				
	}
	public int compete() {
		
		int maximum = 200;
		int minimum = 100;
		
		Random rn = new Random();
		int range = maximum - minimum + 1;
		int time =  rn.nextInt(range) + minimum;
		return time;
		
	}

}
