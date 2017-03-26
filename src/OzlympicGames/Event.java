package OzlympicGames;

import java.util.ArrayList;
import java.util.Random;


public class Event {
	
	private static String name;
	private static String code;
	private static String winner;
	
	public ArrayList<Athlete> runEvent(ArrayList<Athlete> comp, Event upcoming) {
		
		Random randomizer = new Random();
		ArrayList<Athlete> athInComp = new ArrayList<Athlete>(); 
		
		for (int i=0;i < comp.size(); i++) {
			Athlete currentAthlete = comp.get(i);
			athInComp.add(currentAthlete);
		
		}
		//Sets 1st place
		Athlete FirstPlace = athInComp.get(randomizer.nextInt(athInComp.size()));
		System.out.println("Winner is " + FirstPlace.getName());		
		athInComp.remove(athInComp.indexOf(FirstPlace));
		FirstPlace.setScore(5);					
		FirstPlace = null;
		
		//Sets 2nd place
		Athlete secondPlace = athInComp.get(randomizer.nextInt(athInComp.size()));
		System.out.println("Second place is " + secondPlace.getName());
		athInComp.remove(athInComp.indexOf(secondPlace));
		secondPlace.setScore(2);
		secondPlace =null;
		
		//Sets 3rd place
		Athlete thirdPlace = athInComp.get(randomizer.nextInt(athInComp.size()));
		System.out.println("Third place is " + thirdPlace.getName());
		athInComp.remove(athInComp.indexOf(thirdPlace));
		thirdPlace.setScore(1);
		thirdPlace =null;
		
		
		return comp; 
	}
	
	public String getName() {	
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getWinner() {		
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
}
