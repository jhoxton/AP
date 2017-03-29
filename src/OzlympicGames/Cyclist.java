package OzlympicGames;

import java.util.Random;

public class Cyclist extends Athlete  {

	public Cyclist(int id, String name, int age, int score) {
		super(id, name, age, score);
		
	}
	public int compete() {
		
	
		int maximum = 800;
		int minimum = 500;
		
		Random rn = new Random();
		int range = maximum - minimum + 1;
		int time =  rn.nextInt(range) + minimum;
		return time;
		
	}
	
}
