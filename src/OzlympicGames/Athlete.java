package OzlympicGames;

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
	
	public void setScore(int score) {
		this.score = score + 10;//Will change depending on place
	}
	
}
