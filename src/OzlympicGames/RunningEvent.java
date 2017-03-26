package OzlympicGames;

import java.util.ArrayList;

public class RunningEvent extends Event {
	
	public RunningEvent () {
		super();
		setName("Running Event");	
		setCode("R0" + getEventsRun());
				//USE "INSTANCE OF" TO CHECK THAT ONLY RELATED ATHLETES CAN COMPETE
	}
	@Override
	public ArrayList<Athlete> loadEvent(ArrayList<Athlete> loadArray){
		
		for (int i=0;i < loadArray.size(); i++) { //Copies main array to event object
			Athlete currentAthlete = loadArray.get(i);
			if(currentAthlete instanceof Sprinter) {
				System.out.println("Check method worked");
				loadArray.add(currentAthlete);	
				
			} else {
				loadArray.remove(loadArray.indexOf(currentAthlete));
			}
		}
		
		return loadArray;
	}
	
	public ArrayList<Athlete> checkComp (ArrayList<Athlete> athInComp) {
		for (int i=0;i < athInComp.size(); i++) { //Copies main array to event object
			Athlete currentAthlete = athInComp.get(i);
			if(currentAthlete instanceof Sprinter) {
				System.out.println("Check method worked");
			} else {
				athInComp.remove(athInComp.indexOf(currentAthlete));
			}
			
			
		}
		
		return athInComp;
	}
	
	
}
