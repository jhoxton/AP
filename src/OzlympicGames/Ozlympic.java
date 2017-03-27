package OzlympicGames;
import java.util.*;

public class Ozlympic {

	static Event upcoming = new Event();
	static Scanner input = new Scanner(System.in);
	protected static boolean eventSet = false;

	public static void main(String[] args) {
	
		ArrayList<Athlete> comp = new ArrayList<Athlete>(); 
		ArrayList<Athlete> loadArray = new ArrayList<Athlete>(); 
		
		Cyclist cycle = new Cyclist(0, "Cycle Test", 0, 0); //TEST ATHLETES 
		Cyclist cycle2 = new Cyclist(0, "Cycle Test 2", 0, 0); 
		Cyclist cycle3 = new Cyclist(0, "Cycle Test 3", 0, 0); //TEST ATHLETES 
		Cyclist cycle4 = new Cyclist(0, "Cycle Test 4", 0, 0); //TEST ATHLETES 
		comp.add(cycle);
		comp.add(cycle2);
		comp.add(cycle3);
		comp.add(cycle4);
		
		Swimmer swim = new Swimmer(0, "Swim Test", 0, 0); 
		Swimmer swim2 = new Swimmer(0, "Swim Test 2", 0, 0); 
		Swimmer swim3 = new Swimmer(0, "Swim Test 3", 0, 0); 
		Swimmer swim4 = new Swimmer(0, "Swim Test 4", 0, 0); 
		comp.add(swim);
		comp.add(swim2);
		comp.add(swim3);
		comp.add(swim4);
		
		Sprinter sprint = new Sprinter(0, "Sprint Test", 0, 0);
		Sprinter sprint2 = new Sprinter(0, "Sprint Test 2", 0, 0);
		Sprinter sprint3 = new Sprinter(0, "Sprint Test 3", 0, 0);
		Sprinter sprint4 = new Sprinter(0, "Sprint Test 4", 0, 0);
		Sprinter sprint5 = new Sprinter(0, "Sprint Test 5", 0, 0);
		comp.add(sprint);
		comp.add(sprint2);
		comp.add(sprint3);
		comp.add(sprint4);
		comp.add(sprint5);
		
		SuperAthlete superAth = new SuperAthlete(0, "Super Test 1", 0, 0);
		SuperAthlete superAth2 = new SuperAthlete(0, "Super Test 2", 0, 0);
		SuperAthlete superAth3 = new SuperAthlete(0, "Super Test 3", 0, 0);
		SuperAthlete superAth4 = new SuperAthlete(0, "Super Test 4", 0, 0);
		comp.add(superAth);
		comp.add(superAth2);
		comp.add(superAth3);
		comp.add(superAth4);
		
		
		
		menu(comp, upcoming, loadArray);
		
	}
	public static void menu(ArrayList<Athlete> comp, Event upcoming, ArrayList<Athlete> loadArray) {
		
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
				case 1: selectGame(comp, upcoming, loadArray);
					break;					
				case 2: predictGame();
					break;
				case 3: startGame(comp, upcoming, loadArray); //TODO add loadArray 
					break;
				case 4: displayGames(loadArray);
					break;
				case 5: displayAthletes(comp, loadArray);
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

	static void selectGame(ArrayList<Athlete> comp, Event upcoming, ArrayList<Athlete> loadArray) {
		
// MAKE A LOAD GAME EVENT THAT PUTS ATHLETES IN AN ARRAY FIRST		
		
		
		Event currentEvent = new Event();
		
//		ArrayList<Athlete> loadArray = new ArrayList<Athlete>(); 
		
		System.out.println("Select event to hold:\n1) Swimming Event\n2) Sprinting Event\n3) Cycling Event");
		int option = input.nextInt();
//		try
//		System.out.println(loadArray);
		loadArray = comp;
//		System.out.println(loadArray);
		ArrayList<Athlete> test = new ArrayList<Athlete>();
			if(option == 1) {				
				currentEvent = new SwimEvent();
				eventSet = true;			
				
			} else if(option ==2) {				
				currentEvent = new RunningEvent();
				eventSet = true;
				
				currentEvent.loadEvent(loadArray);
				System.out.println("loadArray ........ " +loadArray);
				
				
				
				
			} else if (option ==3) {
				
				currentEvent = new CyclingEvent();				
				eventSet = true;
			} else {
				System.out.println("Please select an event to hold");
			}
			upcoming = new Event();
			
			//TODO Change to loadArray
			
			
			currentEvent = upcoming;
			menu(comp, upcoming, loadArray);
			return;
		
	} 
	
	


	static void predictGame() {
		//TODO
	}
	
	static void startGame(ArrayList<Athlete> comp, Event upcoming,ArrayList<Athlete> loadArray) {
		
		if(eventSet ==false ) {
			System.out.println("Please select an event to hold first");
			menu(comp, upcoming, loadArray);
		} else {
			
		System.out.println("Running Event....");
			upcoming.runEvent(comp, upcoming, loadArray);	
			
		}
		
		eventSet = false;
		menu(comp, upcoming, loadArray);		
		
	}
	
	static void displayGames(ArrayList<Athlete> loadArray) {
		System.out.println(loadArray);
		
		
	}

	static void displayAthletes(ArrayList<Athlete> comp, ArrayList<Athlete> loadArray) {
		for(int i = 0; i < comp.size(); i++) {
			
			Athlete currentAthlete = comp.get(i);
			
			System.out.println("=============");
			System.out.println("Name:" +currentAthlete.getName());
			System.out.println("Age:" +currentAthlete.getAge());
			System.out.println("Current Score:" +currentAthlete.getScore());
			
		}
		
		menu(comp, upcoming, loadArray);
	}
}
