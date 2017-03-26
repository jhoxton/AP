package OzlympicGames;
import java.util.*;

public class Ozlympic {

	static Event upcoming = new Event();
	static Scanner input = new Scanner(System.in);
	protected static boolean eventSet = false;

	public static void main(String[] args) {
	
		Cyclist cycle = new Cyclist(0, "Cycle Test", 0, 0); //TEST ATHLETES 
		Swimmer swim = new Swimmer(0, "Swim Test", 0, 0); 
		Sprinter sprint = new Sprinter(0, "Sprint Test", 0, 0);
		SuperAthlete superAth = new SuperAthlete(0, "Super Test", 0, 0);
		
		ArrayList<Athlete> comp = new ArrayList<Athlete>(); 	
		comp.add(cycle);
		comp.add(superAth);
		comp.add(swim);
		comp.add(sprint);
		
		menu(comp, upcoming);
		
	}
	public static void menu(ArrayList<Athlete> comp, Event upcoming) {
	
		System.out.println("\n==============");
		System.out.println("Ozlympic Games\n==============");
		
		if(eventSet == true) {
			System.out.println("The next event to be held is a " + upcoming.getName() + "\n");
		} else {
			System.out.println("No upcoming event\n");
		}
		
		System.out.println("1) Select a Game to Run\n2) Predict the Winner of Game\n3) Start the Game\n4) Display the results of all Games\n5) Display points of all athletes\n6) Exit\n");
		System.out.println("Enter an Option: ");
		
		int option = input.nextInt();
			switch(option) {
				case 1: selectGame(comp, upcoming);
					break;					
				case 2: predictGame();
					break;
				case 3: startGame(comp, upcoming); 
					break;
				case 4: displayGames();
					break;
				case 5: displayAthletes(comp);
					break;
				case 6: 
					System.out.println("Arrays cleared. Games reset. Goodbye!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid option!");
			} 
			
		return;
			
		}

	static void selectGame(ArrayList<Athlete> comp, Event upcoming) {
		
		Event currentEvent = new Event();
		

		
		System.out.println("Select event to hold:\n1) Swimming Event\n2) Sprinting Event\n3) Cycling Event");
		int option = input.nextInt();
//		try
			if(option == 1) {				
				currentEvent = new SwimEvent();
				eventSet = true;
			} else if(option ==2) {
				
				currentEvent = new RunningEvent();
				eventSet = true;
			} else if (option ==3) {
				
				currentEvent = new CyclingEvent();				
				eventSet = true;
			} else {
				System.out.println("Please select an event to hold");
			}
			
			currentEvent = upcoming;
			menu(comp, upcoming);
			return;
		
	} 
	
	


	static void predictGame() {
		//TODO
	}
	
	static void startGame(ArrayList<Athlete> comp, Event upcoming) {
		
		if(eventSet ==false ) {
			System.out.println("Please select an event to hold first");
			menu(comp, upcoming);
		} else {
			
		System.out.println("Running Event....");
			upcoming.runEvent(comp, upcoming);			
		}
		
		eventSet = false;
		menu(comp, upcoming);

		
		
	}
	
	static void displayGames() {
		
		
	}

	static void displayAthletes(ArrayList<Athlete> comp) {
		for(int i = 0; i < comp.size(); i++) {
			
			Athlete currentAthlete = comp.get(i);
			
			System.out.println("=============");
			System.out.println("Name:" +currentAthlete.getName());
			System.out.println("Age:" +currentAthlete.getAge());
			System.out.println("Current Score:" +currentAthlete.getScore());
			System.out.println("=============");
			
			
			
		}
		
		menu(comp, upcoming);
	}
}
