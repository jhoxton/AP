package OzlympicGames;

import java.util.Random;

public class Swimmer extends Athlete {

	public Swimmer(int id, String name, int age, int score) {
		super(id, name, age, score);
		
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
