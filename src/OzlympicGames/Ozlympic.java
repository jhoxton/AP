package OzlympicGames;
import java.util.*;

public class Ozlympic {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		//RASNDKJASDKJASHDJKASHKDJLASJKL:DJASKL
//		Athlete shit = new Athlete(0, null, 0, 0);
//		Athlete shit2 = new Athlete(0, null, 0, 0);
//		
		
		System.out.println("Ozlympic Games\n==============\n");
		System.out.println("1) Select a Game to Run\n2) Predict the Winner of Game\n3) Start the Game\n4) Display the results of all Games\n5) Display points of all athletes\n6) Exit\n");
		System.out.println("Enter an Option: ");
		
		int option = input.nextInt();
		try {
			switch(option) {
				case 1: runGame();
					break;
					
				case 2: predictGame();
					break;
				case 3: startGame();
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
			
		} catch (Exception e) { //FIND CODE FOR THIS TO WORK!!!!!
			System.out.println("Invalid input\nPlease enter a number between 1-6");
			System.out.println();
			input.nextLine();
			}
		
		
	}

	static void runGame() {
		
	} 
	
	static void predictGame() {
		
	}
	
	static void startGame() {
		
	}
	
	static void displayGames() {
		
	}

	static void displayAthletes() {
		
	}
}
