package OzlympicGames;

public class CyclingEvent extends Event {
	
	public CyclingEvent() {
		super();
		setName("Cycling Event");		
		setCode("C0" + getEventsRun());
		//USE "INSTANCE OF" TO CHECK THAT ONLY RELATED ATHLETES CAN COMPETE
	}
	
	
}
