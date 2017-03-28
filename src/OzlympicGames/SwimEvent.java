package OzlympicGames;

import java.util.ArrayList;

public class SwimEvent extends Event {
			
	public SwimEvent () {
		super();
		setName("Swimming Event");		
		setCode("S0" + getEventsRun());
	}

	@Override
	public ArrayList<Athlete> loadEvent(ArrayList<Athlete> athletes){ //NEW ATTEMPT
		
		ArrayList<Athlete> tempArray = new ArrayList<Athlete>(); 
//		System.out.println("this array was sent to the subclass" + athletes.size());

		for (int i=0; i < athletes.size(); i++) {			
			Athlete currentAthlete = athletes.get(i);		
			if	(currentAthlete instanceof Swimmer || currentAthlete instanceof SuperAthlete) {
				tempArray.add(currentAthlete);					
//				System.out.println("Check method worked" + currentAthlete.getName());// Checks the loop has worked correctly				
				} 
			}		
		return tempArray;
	}
	
	
	
	
	
}
