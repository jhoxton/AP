package OzlympicGames;

import java.util.ArrayList;

public class CyclingEvent extends Event {
	
	public CyclingEvent() {
		super();
		setName("Cycling Event");		
		setCode("C0" + getEventsRun());
		
	}
	@Override
	public ArrayList<Athlete> loadEvent(ArrayList<Athlete> athletes){ //NEW ATTEMPT
		
		ArrayList<Athlete> tempArray = new ArrayList<Athlete>(); 
//		System.out.println("this array was sent to the subclass" + athletes.size());

		for (int i=0; i < athletes.size(); i++) {			
			Athlete currentAthlete = athletes.get(i);		
			if	(currentAthlete instanceof Cyclist || currentAthlete instanceof SuperAthlete) {
				tempArray.add(currentAthlete);					
//				System.out.println("Check method worked" + currentAthlete.getName());// Checks the loop has worked correctly				
				} 
			}		
		return tempArray;
	}
	
}
