package OzlympicGames;

public class SwimEvent extends Event {
	
	private Athlete canCompete;
			
	public SwimEvent () {
		super();
		setName("Swimming Event");		
		setCode("S0" + getEventsRun());
		
		//USE "INSTANCE OF" TO CHECK THAT ONLY RELATED ATHLETES CAN COMPETE
		
	}
	
	
	
	
	
	
}
