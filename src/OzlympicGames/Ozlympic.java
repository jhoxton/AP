package OzlympicGames;
import java.util.*;

public class Ozlympic {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		Athlete shit = new Athlete(0, "Shit 1", 0, 0); //TEST ATHLETES 
		Athlete shit2 = new Athlete(0, "Shit 2", 0, 0);
		Swimmer swim = new Swimmer(0, "Swim Shit", 0, 0); 
		
		ArrayList<Athlete> comp = new ArrayList<Athlete>(); 
		comp.add(shit);
		comp.add(shit2);
		comp.add(swim);
		
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
		
	} 
	
	static void predictGame() {
		
	}
	
	static void startGame(ArrayList<Athlete> comp) {
		Event currentEvent = new Event();
		currentEvent.Event(comp);
		
		
	}
	
	static void displayGames() {
		
	}

	static void displayAthletes() {
		
	}
}
