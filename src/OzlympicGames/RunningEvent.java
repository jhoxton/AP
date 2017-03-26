package OzlympicGames;

public class RunningEvent extends Event {
	
	public RunningEvent () {
		super();
		setName("Running Event");	
		setCode("R0" + getEventsRun());
		
		//USE "INSTANCE OF" TO CHECK THAT ONLY RELATED ATHLETES CAN COMPETE
	}
	
	
}
