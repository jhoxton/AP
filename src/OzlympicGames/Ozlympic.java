package OzlympicGames;
import java.util.*;

public class Ozlympic {

	static Event upcoming = new Event();
	static Scanner input = new Scanner(System.in);
	protected static boolean eventSet = false;
	public static int userPic= 0;
	
	
	public static void main(String[] args) {
	
		ArrayList<Athlete> comp = new ArrayList<Athlete>(); 
		ArrayList<Athlete> loadArray = new ArrayList<Athlete>(); 
		ArrayList<Event> pastEvents = new ArrayList<Event>();
		
		Cyclist cycle = new Cyclist(1, "Cycle Test", 0, 0); //TEST ATHLETES 
		Cyclist cycle2 = new Cyclist(2, "Cycle Test 2", 0, 0); 
		Cyclist cycle3 = new Cyclist(3, "Cycle Test 3", 0, 0); //TEST ATHLETES 
		Cyclist cycle4 = new Cyclist(4, "Cycle Test 4", 0, 0); //TEST ATHLETES 
		comp.add(cycle);
		comp.add(cycle2);
		comp.add(cycle3);
		comp.add(cycle4);
		
		Swimmer swim = new Swimmer(5, "Swim Test", 0, 0); 
		Swimmer swim2 = new Swimmer(6, "Swim Test 2", 0, 0); 
		Swimmer swim3 = new Swimmer(7, "Swim Test 3", 0, 0); 
		Swimmer swim4 = new Swimmer(8, "Swim Test 4", 0, 0); 
		comp.add(swim);
		comp.add(swim2);
		comp.add(swim3);
		comp.add(swim4);
		
		Sprinter sprint = new Sprinter(9, "Sprint Test", 0, 0);
		Sprinter sprint2 = new Sprinter(10, "Sprint Test 2", 0, 0);
		Sprinter sprint3 = new Sprinter(11, "Sprint Test 3", 0, 0);
		Sprinter sprint4 = new Sprinter(12, "Sprint Test 4", 0, 0);
		Sprinter sprint5 = new Sprinter(13, "Sprint Test 5", 0, 0);
		comp.add(sprint);
		comp.add(sprint2);
		comp.add(sprint3);
		comp.add(sprint4);
		comp.add(sprint5);
		
		SuperAthlete superAth = new SuperAthlete(14, "Super Test 1", 0, 0);
		SuperAthlete superAth2 = new SuperAthlete(15, "Super Test 2", 0, 0);
		SuperAthlete superAth3 = new SuperAthlete(16, "Super Test 3", 0, 0);
		SuperAthlete superAth4 = new SuperAthlete(17, "Super Test 4", 0, 0);
		comp.add(superAth);
		comp.add(superAth2);
		comp.add(superAth3);
		comp.add(superAth4);
		
		menu(comp, upcoming, loadArray, pastEvents);
		
	}
	public static void menu(ArrayList<Athlete> comp, Event upcoming, ArrayList<Athlete> loadArray, ArrayList<Event> pastEvents) {
		
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
				case 2: predictGame(loadArray, upcoming, loadArray, pastEvents);
					break;
				case 3: startGame(comp, upcoming, loadArray, pastEvents);  
				
					break;
				case 4: 
				displayGames(loadArray, pastEvents);
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
		
		Event currentEvent = new Event();
		
		System.out.println("Select event to hold:\n1) Swimming Event\n2) Sprinting Event\n3) Cycling Event");
		int option = input.nextInt();
		loadArray = comp;
		System.out.println(loadArray.size());
		
			if(option == 1) {				
				currentEvent = new SwimEvent();
				eventSet = true;				
				ArrayList<Athlete> returningArray = new ArrayList<Athlete>(); 			
				returningArray = currentEvent.loadEvent(loadArray); 
				loadArray = returningArray;				

				System.out.println("The competeing athletes are " );
				for(int i = 0; i < loadArray.size(); i++) {
					Athlete currentAthlete = loadArray.get(i);
					System.out.println(currentAthlete.getName());
				}
				
			} else if(option ==2) {				
				currentEvent = new RunningEvent();
				eventSet = true;				
				ArrayList<Athlete> returningArray = new ArrayList<Athlete>(); 			
				returningArray = currentEvent.loadEvent(loadArray); 
				loadArray = returningArray;				

				System.out.println("The competeing athletes are " );
				for(int i = 0; i < loadArray.size(); i++) {
					Athlete currentAthlete = loadArray.get(i);
					System.out.println(currentAthlete.getName());
				}				
//				System.out.println(returningArray); //This tests the correct array was returned 
	
			} else if (option ==3) {
				currentEvent = new CyclingEvent();
				eventSet = true;				
				ArrayList<Athlete> returningArray = new ArrayList<Athlete>(); 			
				returningArray = currentEvent.loadEvent(loadArray); 
				loadArray = returningArray;				

				System.out.println("The competeing athletes are " );
				for(int i = 0; i < loadArray.size(); i++) {
					Athlete currentAthlete = loadArray.get(i);
					System.out.println(currentAthlete.getName());
				}
			} else {
				System.out.println("Please select an event to hold");
			}
//			upcoming = new Event();
			currentEvent = upcoming;
			menu(comp, upcoming, loadArray, null);
			return;
		
	} 
	
	static void predictGame(ArrayList<Athlete> comp, Event upcoming, ArrayList<Athlete> loadArray, ArrayList<Event> pastEvents) {
		
		if(eventSet ==false ) {
			System.out.println("Please select an event to hold first");
			menu(comp, upcoming, loadArray, pastEvents);
		} else {		
			for (int i=0; i < loadArray.size(); i++) {			
				Athlete loopAth = loadArray.get(i);		
				System.out.println("Name: " + loopAth.getName()+ "\nID: " + loopAth.getId()+  "\n======== ");	
			}
			System.out.println("Enter ID of athlete you predict will win: ");
			userPic = input.nextInt();
			menu(comp, upcoming, loadArray, pastEvents);
		}		
	}
	
	static void startGame(ArrayList<Athlete> comp, Event upcoming,ArrayList<Athlete> loadArray, ArrayList<Event> pastEvents) {
		
		if(eventSet ==false ) {
			System.out.println("Please select an event to hold first");
			menu(comp, upcoming, loadArray, pastEvents);
		} else {				
			upcoming.runEvent(comp, upcoming, loadArray);	
			Event shite = new Event();
			
			shite = upcoming;
			
			
			int winner=  shite.getWinnerId();
			
//			System.out.println("userPic " + userPic);// Checking the user pic
//			System.out.println("winner " + winner);// Checking the winner's ID
			
			if (userPic != winner) {
				System.out.println("");
			} else {
				System.out.println("Congrats! You picked the winner!");
			}
			
		}		
		
//		Event currentEvent = new Event();
//		currentEvent = upcoming;
//		pastEvents.add(currentEvent);
					
		eventSet = false;
		menu(comp, upcoming, loadArray, pastEvents);		
		
	}
	
	static void displayGames(ArrayList<Athlete> loadArray, ArrayList<Event> pastEvents) {
		//TODO Apply get/set methods in Events class
		
//		System.out.println(pastEvents.size());
//		
//		
//		for (int i=0; i < pastEvents.size(); i++) {			
//			Event loopEvent = pastEvents.get(i);		
//			System.out.println("Event: " + loopEvent.getCode() + "\nWinner: " + loopEvent.getWinner() + "\n======== ");	
//		}
		
		
		menu(loadArray, upcoming, loadArray, pastEvents);
		
		
	}

	static void displayAthletes(ArrayList<Athlete> comp, ArrayList<Athlete> loadArray) {
		for(int i = 0; i < comp.size(); i++) {
			
			Athlete currentAthlete = comp.get(i);
			
			System.out.println("=============");
			System.out.println("Name:" +currentAthlete.getName());
			System.out.println("Age:" +currentAthlete.getAge());
			System.out.println("Current Score:" +currentAthlete.getScore());
			
		}
		
		menu(comp, upcoming, loadArray, null);
	}
}
