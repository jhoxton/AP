package OzlympicGames;

import java.util.Random;

public class Athlete {

	private int id;
	private String name;
	private int age;
	private String state;
	private int score;
	
	public Athlete(int id, String name, int age, int score) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}
		
	public int compete(String superName) {
		return 0;

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
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
