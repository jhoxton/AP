package OzlympicGames;

public class Offical {
	
	private int id;
	private String name;
	private int age;
	
	
	public Offical(int id, String name, int age) {
		this.setId(id);
		this.setName(name);
		this.setAge(age);		
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


	public void setAge(int age) {
		this.age = age;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public void Announce() {
		
	}
}
