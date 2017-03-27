package OzlympicGames;

import java.util.ArrayList;

public class RunningEvent extends Event {
	
	public RunningEvent () {
		super();
		setName("Running Event");	
		setCode("R0" + getEventsRun());
	}
	
	@Override
//	public ArrayList<Athlete> loadEvent(ArrayList<Athlete> athletes){//OLD ATTEMPT
	
	public ArrayList<Athlete> loadEvent(ArrayList<Athlete> athletes){ //NEW ATTEMPT
		
		ArrayList<Athlete> tempArray = new ArrayList<Athlete>(); 
		System.out.println("this array was sent to the subclass" + athletes.size());

		for (int i=0; i < athletes.size(); i++) { //Copies main array to event object
			
			Athlete currentAthlete = athletes.get(i);
		
			if	(currentAthlete instanceof Sprinter) {
				tempArray.add(currentAthlete);	
				
				System.out.println("Check method worked" + currentAthlete.getName());				
				} 
			}
		System.out.println("TempArray is " + tempArray);
		
		return athletes;
	}
	
	
	
//	@Override
//	public ArrayList<Athlete> loadEvent(ArrayList<Athlete> loadArray){
//		System.out.println("Called subclass method");
//		
//		ArrayList<Athlete> test = new ArrayList<Athlete>();
//
//		for (int i=0; i < loadArray.size(); i++) { //Copies main array to event object
//			
//			Athlete currentAthlete = loadArray.get(i);
//			
//			
//			if(!(currentAthlete instanceof Sprinter)) {
//				loadArray.remove(loadArray.indexOf(currentAthlete));
//				} else if (currentAthlete instanceof Sprinter) {
//				
//				test.add(currentAthlete);	
//				System.out.println("Check method worked" + currentAthlete.getName());
//				}		
//			}
//		loadArray = test;
//		return loadArray;
//	}
	
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
