package OzlympicGames;

import java.util.ArrayList;
import java.util.Random;


public class Event {
	
	private static String name;
	private static String code;
	
	private static int eventsRun;
	
	public ArrayList<Athlete> runEvent (ArrayList<Athlete> comp, Event upcoming) {
		this.setCode(code);
		System.out.println("Event " + code);
		
		
		
		Random randomizer = new Random();
		ArrayList<Athlete> athInComp = new ArrayList<Athlete>(); 
		
		for (int i=0;i < comp.size(); i++) {
			Athlete currentAthlete = comp.get(i);
			athInComp.add(currentAthlete);
		}
		
		Athlete ath1 = athInComp.get(randomizer.nextInt(athInComp.size()));
		int time1 =ath1.compete();
		
		athInComp.remove(athInComp.indexOf(ath1));
		
		Athlete ath2 = athInComp.get(randomizer.nextInt(athInComp.size()));
		int time2 =ath2.compete();
		
		athInComp.remove(athInComp.indexOf(ath2));
		
		Athlete ath3 = athInComp.get(randomizer.nextInt(athInComp.size()));
		
		athInComp.remove(athInComp.indexOf(ath3));
		
		int time3 =ath3.compete();

		if ( time1 > time2 && time1 > time3 ) { //ATH1 WINS
			System.out.println("The winner is " + ath1.getName() + " at " + time1);
			ath1.setScore(5);	
			
			if (time2 > time3) {
				System.out.println("\nSecond place is " + ath2.getName() + " at " + time2);
				ath2.setScore(2);
				System.out.println("\nThird place is " + ath3.getName() + " at " + time3);
				ath3.setScore(1);
			} else if (time3 > time2) {
				System.out.println("\nSecond place is " + ath3.getName() + " at " + time3);
				ath3.setScore(2);
				System.out.println("\nThird place is " + ath3.getName() + " at " + time2);
				ath2.setScore(1);
			}						
		} else if (time2 > time1 && time2 > time3) {//ATH2 WINS		
			System.out.println("The winner is " + ath2.getName() + " at " + time2);
			ath2.setScore(5);			
			if (time1 > time3) {
				System.out.println("\nSecond place is " + ath1.getName() + " at " + time1);
				ath1.setScore(2);
				System.out.println("\nThird place is " + ath3.getName() + " at " + time3);
				ath3.setScore(1);
			} else if (time3 > time1) {
				System.out.println("\nSecond place is " + ath3.getName() + " at " + time3);
				ath3.setScore(2);
				System.out.println("\nThird place is " + ath2.getName() + " at " + time2);
				ath2.setScore(1);
			}
		} else if ( time3 > time2 && time3 > time1 ) {	//ATH3 WINS
			System.out.println("\nThe winner is " + ath3.getName() + " at " + time3);
			ath3.setScore(5);
			if (time2 > time1) {
				System.out.println("\nSecond place is " + ath2.getName() + " at " + time2);
				ath2.setScore(2);
				System.out.println("\nThird place is " + ath1.getName() + " at " + time1);
				ath1.setScore(1);
			} else if (time1 > time2) {
				System.out.println("\nSecond place is " + ath1.getName() + " at " + time1);
				ath1.setScore(1);
				System.out.println("\nThird place is " + ath2.getName() + " at " + time2);
				ath2.setScore(1);
			}
		}
	
//		//Sets 1st place
//		Athlete FirstPlace = athInComp.get(randomizer.nextInt(athInComp.size()));
//		System.out.println("Winner is " + FirstPlace.getName());		
//		athInComp.remove(athInComp.indexOf(FirstPlace));
//		System.out.println(FirstPlace.compete());
//		FirstPlace.setScore(5);					
//		FirstPlace = null;
//		
//		//Sets 2nd place
//		Athlete secondPlace = athInComp.get(randomizer.nextInt(athInComp.size()));
//		System.out.println("Second place is " + secondPlace.getName());
//		athInComp.remove(athInComp.indexOf(secondPlace));
//		secondPlace.setScore(2);
//		System.out.println(secondPlace.compete());
//		secondPlace =null;
//		
//		//Sets 3rd place
//		Athlete thirdPlace = athInComp.get(randomizer.nextInt(athInComp.size()));
//		System.out.println("Third place is " + thirdPlace.getName());
//		athInComp.remove(athInComp.indexOf(thirdPlace));
//		thirdPlace.setScore(1);
//		System.out.println(thirdPlace.compete());
//		thirdPlace =null;
		
		return comp; 
	}
	
	public String getName() {	
		return name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getEventsRun() {
		eventsRun ++;
		return eventsRun;
	}

	public static void setEventsRun(int eventsRun) {
		Event.eventsRun = eventsRun;
	}


	
	
}
