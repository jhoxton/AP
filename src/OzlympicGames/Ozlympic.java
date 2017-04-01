package OzlympicGames;
import java.util.*;
import java.util.HashSet;


public class Ozlympic {

	static Event upcoming = new Event();

	Set<Event> finishedEvents = new HashSet<Event>();
	
	
	//
	
	static Scanner input = new Scanner(System.in);
	protected static boolean eventSet = false;
	public static int userPic= 0;
	private static ArrayList<Event> pastEvents ;
	
	public static void main(String[] args) {
		
		System.out.println();
	
		ArrayList<Athlete> comp = new ArrayList<Athlete>(); 
		ArrayList<Athlete> loadArray = new ArrayList<Athlete>(); 
		ArrayList <Event> pastEvents = new ArrayList<Event>();
		ArrayList<Offical> offs = new ArrayList<Offical>();
		
		
		
		//TODO add annouce function to event
		Offical off1 = new Offical(0, "Offical 1", 0);
		Offical off2 = new Offical(0, "Offical 2", 0);		
		Offical off3 = new Offical(0,"Offical 3",0);
		Offical off4 = new Offical(0,"Offical 4",0);
				
		offs.add(off1);
		offs.add(off2);
		offs.add(off3);
		offs.add(off4);
				
		Cyclist cycle = new Cyclist(1, "Cycle Test", 0, 0); //TEST ATHLETES 
		Cyclist cycle2 = new Cyclist(2, "Cycle Test 2", 0, 0); 
		Cyclist cycle3 = new Cyclist(3, "Cycle Test 3", 0, 0); //TEST ATHLETES 
		Cyclist cycle4 = new Cyclist(4, "Lance Armstrong's missing testicle", 0, 0); //TEST ATHLETES 
		
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
		
		menu(comp, upcoming, loadArray, pastEvents, offs);
		
	}
	public static void menu(ArrayList<Athlete> comp, Event upcoming, ArrayList<Athlete> loadArray, ArrayList<Event> pastEvents, ArrayList<Offical> offs) {
		
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
				case 1: selectGame(comp, upcoming, loadArray, pastEvents, offs);
					break;					
				case 2: predictGame(loadArray, upcoming, loadArray, pastEvents, offs);
					break;
				case 3: startGame(comp, upcoming, loadArray, pastEvents, offs); 				
					break;
				case 4: 
				displayGames(loadArray, pastEvents, offs);
					break;
				case 5: displayAthletes(comp, loadArray, offs);
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

	static void selectGame(ArrayList<Athlete> comp, Event upcoming, ArrayList<Athlete> loadArray, ArrayList<Event> pastEvents, ArrayList<Offical> offs) {
		
		Event currentEvent = new Event();
		//TODO Use an Event object constuctor 
		//Create a method to make new events
		
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
			
			currentEvent = upcoming;

			Offical test = pickOffical(offs);
			System.out.println("Overseeing offical is: " + test.getName());
			upcoming.setOffical(test);

			menu(comp, upcoming, loadArray, pastEvents, offs);
			return;
		
	} 
	
	public static void addEvents(Event upcoming) {
		
//		 this.upcoming = new Event();
//		  Event completedEvent = new Event();
		  
		  pastEvents.add(upcoming);
		  	    
		return;	
	}
	
	public static Offical pickOffical(ArrayList<Offical> offs) {
	    Random rand = new Random(); 
	    Offical randomOff = offs.get(rand.nextInt(offs.size()));
	    return randomOff;
	}
	
	static void predictGame(ArrayList<Athlete> comp, Event upcoming, ArrayList<Athlete> loadArray, ArrayList<Event> pastEvents, ArrayList<Offical> offs) {
		
		if(eventSet ==false ) {
			System.out.println("Please select an event to hold first");
			menu(comp, upcoming, loadArray, pastEvents, offs);
		} else {		
			for (int i=0; i < loadArray.size(); i++) {			
				Athlete loopAth = loadArray.get(i);		
				System.out.println("Name: " + loopAth.getName()+ "\nID: " + loopAth.getId()+  "\n======== ");	
			}
			System.out.println("Enter ID of athlete you predict will win: ");
			userPic = input.nextInt();
			menu(comp, upcoming, loadArray, pastEvents, offs);
		}		
	}
	
	static void startGame(ArrayList<Athlete> comp, Event upcoming,ArrayList<Athlete> loadArray, ArrayList<Event> pastEvents, ArrayList<Offical> offs) {
		Event done;
		if(eventSet ==false ) {
			System.out.println("Please select an event to hold first");
			menu(comp, upcoming, loadArray, pastEvents, offs);
		} else {							
			System.out.println("Offical for " + upcoming.getCode() + " is " + upcoming.getOffical().getName());
			upcoming.runEvent(comp, upcoming, loadArray, offs);	//The event launches here
			Event finEvent = new Event();	
			finEvent = upcoming;		
			int winner=  finEvent.getWinnerId();
			
//			System.out.println("You picked " + userPic + " to win");// Checking the user pic
//			System.out.println("The winner was " + winner);// Checking the winner's ID
//			
			if (userPic != winner) {
				System.out.println("");
			} else {
				System.out.println("Congrats! You picked the winner!");
			}
			
		}				

		done = upcoming;
		pastEvents.add(done);

		done =null;
		eventSet = false;
		menu(comp, upcoming, loadArray, pastEvents, offs);		
		
	}
	

	
	static void displayGames(ArrayList<Athlete> loadArray, ArrayList<Event> pastEvents,  ArrayList<Offical> offs) {
		//TODO Apply get/set methods in Events class
		
		System.out.println(pastEvents.size());
		
		//???????????
		for (int i=0; i < pastEvents.size(); i++) {			
			Event loopEvent = pastEvents.get(i);		
			System.out.println("Event: " + loopEvent.getCode() + "\nWinner: " + loopEvent.getWinner() + "\n======== ");	
		}
		
		
		menu(loadArray, upcoming, loadArray, pastEvents, offs);
		
		
	}

	static void displayAthletes(ArrayList<Athlete> comp, ArrayList<Athlete> loadArray, ArrayList<Offical> offs) {
		for(int i = 0; i < comp.size(); i++) {
			
			Athlete currentAthlete = comp.get(i);
			
			System.out.println("=============");
			System.out.println("Name:" +currentAthlete.getName());
			System.out.println("Age:" +currentAthlete.getAge());
			System.out.println("Current Score:" +currentAthlete.getScore());
			
		}
		
		menu(comp, upcoming, loadArray, null, offs);
	}
}
