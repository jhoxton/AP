package OzlympicGames;

import java.util.Random;

public class Athlete {

	private int id;
	private String name;
	private int age;
	private int score;
	
	public Athlete(int id, String name, int age, int score) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}
		
	public int compete() {
		
		int maximum = 20;
		int minimum = 10;
		Random rn = new Random();
		int range = maximum - minimum + 1;
		int time =  rn.nextInt(range) + minimum;
		return time;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
	public void setScore(int i) {
		score = score + i;
		
	}
	
}
