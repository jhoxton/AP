package OzlympicGames;
import java.util.*;

public class Ozlympic {

	static Event upcoming = new Event();
	static Scanner input = new Scanner(System.in);
	static boolean eventSet = false;
	
	
	
	public static void main(String[] args) {
		Athlete shit = new Athlete(0, "Shit 1", 0, 0); //TEST ATHLETES 
		Athlete shit2 = new Athlete(0, "Shit 2", 0, 0);
		Swimmer swim = new Swimmer(0, "Swim Shit", 0, 0); 
		
		ArrayList<Athlete> comp = new ArrayList<Athlete>(); 		
		menu(comp);	
		
	}
	public static void menu(ArrayList<Athlete> comp) {
		
		if(eventSet != false) {
			System.out.println("The next event to be held is a " + upcoming.getName());
		}
		
		System.out.println("Ozlympic Games\n==============\n");
		System.out.println("1) Select a Game to Run\n2) Predict the Winner of Game\n3) Start the Game\n4) Display the results of all Games\n5) Display points of all athletes\n6) Exit\n");
		System.out.println("Enter an Option: ");
		
		int option = input.nextInt();
//		try {
			switch(option) {
				case 1: selectGame();
					break;					
				case 2: predictGame();
					break;
				case 3: startGame(comp); //THIS WILL BE THE ATHLETE ARRAY
					break;
				case 4: displayGames();
					break;
				case 5: displayAthletes();
					break;
				case 6: //WHATS THE COMMAND TO QUIT PROGRAM????????????
					break;
				default:
					System.out.println("Invalid option!");
			} 
			
//		} catch (Exception e) { //FIND CODE FOR THIS TO WORK!!!!!
//			System.out.println("Invalid input\nPlease enter a number between 1-6");
//			System.out.println();
//			input.nextLine();
//			}
		
		
	}

	static void selectGame() {
		
		Event currentEvent = new Event();
		
		System.out.println("TEST CASE=4");
		
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
			
		main(null);
	} 
	
	static void predictGame() {
		
	}
	
	static void startGame(ArrayList<Athlete> comp) {
	
//		upcoming.Event(comp);
		
		
	}
	
	static void displayGames() {
		
	}

	static void displayAthletes() {
		
	}
}
