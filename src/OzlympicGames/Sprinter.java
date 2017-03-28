package OzlympicGames;

import java.util.Random;

public class Sprinter extends Athlete  {

	public Sprinter(int id, String name, int age, int score) {
		super(id, name, age, score);
		
	}
public int compete() {
		
		int maximum = 20;
		int minimum = 10;
		
		Random rn = new Random();
		int range = maximum - minimum + 1;
		int time =  rn.nextInt(range) + minimum;
		return time;
		
	}

}
