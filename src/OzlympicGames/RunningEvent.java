package OzlympicGames;

import java.util.ArrayList;

public class RunningEvent extends Event {
	
	public RunningEvent () {
		super();
		setName("Running Event");	
		setCode("R0" + getEventsRun());
				
	}
	
	
	@Override
	public void loadEvent(ArrayList<Athlete> loadArray){
		System.out.println("Called subclass method");
		
		ArrayList<Athlete> test = new ArrayList<Athlete>();

		for (int i=0; i < loadArray.size(); i++) { //Copies main array to event object
			
			Athlete currentAthlete = loadArray.get(i);
			
			
			if(!(currentAthlete instanceof Sprinter)) {
				loadArray.remove(loadArray.indexOf(currentAthlete));
				} else if (currentAthlete instanceof Sprinter) {
				
				test.add(currentAthlete);	
				System.out.println("Check method worked" + currentAthlete.getName());
				}		
			}
		
		return;
	}
	
//	public ArrayList<Athlete> checkComp (ArrayList<Athlete> athInComp) {
//		for (int i=0;i < athInComp.size(); i++) { //Copies main array to event object
//			Athlete currentAthlete = athInComp.get(i);
//			if(currentAthlete instanceof Sprinter) {
//				System.out.println("Check method worked");
//			} else {
//				athInComp.remove(athInComp.indexOf(currentAthlete));
//			}
//			
//			
//		}
//		
//		return athInComp;
//	}
	
	
}
