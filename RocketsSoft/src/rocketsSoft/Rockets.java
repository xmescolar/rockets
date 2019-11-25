package rocketsSoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.lang.String;
import java.math.*;

public class Rockets {
	//FASE 3 //FASE 4
	private static int type_response() {
		// Introducing option.
		int type;
		
		Scanner in_type = new Scanner(System.in);

		System.out.println("Choose option? " + 
				'\n' + "[1. Rocket A /" +
				'\n' + " 2. Rocket B /" +
				'\n' + " 0. Exit]");
		
		type = in_type.nextInt();

		return type;
	}
	
	private static int type_choice() {
		// Introducing option.
		int choice;
		
		Scanner in_choice = new Scanner(System.in);

		System.out.println("Choose option? " + 
				'\n' + "[1. Accelerate /" +
				'\n' + " 2. Brake /" +
				'\n' + " 0. Exit]");
		
		choice = in_choice.nextInt();

		return choice; 
	}
	
	private static void choose_speed (Rocket rocket, int id_propulsor) {
		int choice;
		boolean indication = true;
		
		do {
			
			choice = type_choice();
			System.out.println("Value : " + choice);
			
			switch (choice) {
			case 1:
				System.out.println("Rocket " + rocket.getId_rocket());
				rocket.getList_propulsors().get(id_propulsor-1).accelerate();
				break;
			case 2:
				System.out.println("Rocket " + rocket.getId_rocket());
				rocket.getList_propulsors().get(id_propulsor-1).brake();
				break;
			case 0:
				System.out.println("Exit program");
				indication = false;
				break;
			default:
				System.out.println("No key pressed.");
				break;
			}
		} while (indication);		
	}
		
	private static void mng_propulsor (Rocket rocket) {
		int id_propulsor;
		
		Scanner in_propulsor = new Scanner(System.in);
		
		// Displaying propulsor by Rocket.
		System.out.println("List of Propulsors for Rocket " + rocket.getId_rocket());
		
		for(int i=0;i<rocket.getList_propulsors().size();i++) {
				System.out.println("Propulsor " + rocket.getList_propulsors().get(i).getId_Propulsor() + " has " + rocket.getList_propulsors().get(i).getNow_Power() + " current power and " + rocket.getList_propulsors().get(i).getMax_Power() + " maximal power.");
		} 
										
		System.out.println("Type Propulsor Rocket: " + rocket.getId_rocket());
		id_propulsor = in_propulsor.nextInt();		
		
		choose_speed(rocket, id_propulsor); // Changing speed rocket (+/-).
			
	}
	
	private static void mng_rocket (Rocket rocket) {
		int maxpower;
		int curpower;
		
		Scanner in_rocket = new Scanner(System.in);
			
		// Asking for Maximal Power Rocket.
		for (int i=0;i<rocket.getList_propulsors().size();i++) {
			System.out.println("Type Maximal Power Rocket " + rocket.getId_rocket() + " - " + "Propulsor " + rocket.getList_propulsors().get(i).getId_Propulsor() + " : ");
			maxpower = in_rocket.nextInt();
			rocket.getList_propulsors().get(i).setMax_Power(maxpower); // Updating Current Power in rocket.
		}
		
		// Asking for Current Power Rocket.
		for (int i=0;i<rocket.getList_propulsors().size();i++) {
			System.out.println("Type Current Power Rocket " + rocket.getId_rocket() + " - " + "Propulsor " + rocket.getList_propulsors().get(i).getId_Propulsor() + " : ");
			curpower = in_rocket.nextInt();
			
			// Checking Current Power not greater than Maximal Power. 
			while (curpower > rocket.getList_propulsors().get(i).getMax_Power()) {
				System.out.println("Current Power it's greatest than Maximal Power.");
				System.out.println("Type Current Power Rocket " + rocket.getId_rocket() + " - " + "Propulsor " + rocket.getList_propulsors().get(i).getId_Propulsor() + " : ");
				curpower = in_rocket.nextInt();									
			}
			
			// Updating Current Power in rocket.
			rocket.getList_propulsors().get(i).setNow_Power(curpower);			
		}
		
		mng_propulsor(rocket); // Accessing to Propulsors.					
	}
	
	//FASE 4
	private static void formula (Rocket rocket) {
		int initial_speed; //First Speed
		double speed = 0; // Last Speed.
		int PT = 0; // Sumatory of Power by Rocket.
				
		for (int i=0;i<rocket.getList_propulsors().size();i++) {
			PT += rocket.getList_propulsors().get(i).getNow_Power();
		}

		for (int i=0;i<rocket.getList_propulsors().size();i++) {
			System.out.println("Propulsor " + rocket.getList_propulsors().get(i).getId_Propulsor() + " Current Power: " + rocket.getList_propulsors().get(i).getNow_Power() + " Maximal Power " + rocket.getList_propulsors().get(i).getMax_Power());
			initial_speed = rocket.getList_propulsors().get(i).getNow_Power();
			speed =  initial_speed + (100*Math.sqrt(PT));
		}	
		
		System.out.println("Rocket " +  rocket.getId_rocket() + " has a global power of " + PT);
		System.out.println("Speed of Rocket " + rocket.getId_rocket() + " it's " + speed);

	}
	
    public static void main(String[] args) {
        //FASE 1:
/*		//Creating 2 rockets
        Rocket rocket_A = new Rocket("32WESSDS",3);
        Rocket rocket_B = new Rocket("LDSFJA32",6);
        
		//Displaying 2 rockets
        System.out.println("Rocket A has code " + rocket_A.getId_rocket() + " and " + rocket_A.getPropulsors() + " propulsors.");
        System.out.println("Rocket B has code " + rocket_B.getId_rocket() + " and " + rocket_B.getPropulsors() + " propulsors.");
*/  
/*
        //FASE 2:
    	//Creating 2 rockets  
    	 *       
        //Rocket A has 3 propulsors (power:10,30,80).
        List<Propulsor> power_A = new ArrayList<Propulsor>();
        power_A.add(0, new Propulsor(1,10));
        power_A.add(1, new Propulsor(2,30));
        power_A.add(2, new Propulsor(3,80));
        
        Rocket rocket_A = new Rocket("32WESSDS",3,power_A);
        System.out.println("Rocket A has code " + rocket_A.getId_rocket() + " : " + rocket_A.getList_propulsors() + " propulsors.");
                
        //Rocket B has 6 propulsors (power:30,40,50,50,30,10).
        List<Propulsor> power_B = new ArrayList<Propulsor>();
        power_B.add(0, new Propulsor(1,30));
        power_B.add(1, new Propulsor(2,40));
        power_B.add(2, new Propulsor(3,50));
        power_B.add(3, new Propulsor(4,50));
        power_B.add(4, new Propulsor(5,30));
        power_B.add(5, new Propulsor(6,10));
        
        Rocket rocket_B = new Rocket("LDSFJA32",6,power_B);
        System.out.println("Rocket B has code " + rocket_B.getId_rocket() + " : " + rocket_B.getList_propulsors() + " propulsors.");
*/
    	
    	//FASE 3:
/*
    	//Creating 2 rockets : 32WESSDS and LDSFJA32.
	
    	//Rocket A has 3 propulsors. Initializing Current Power and Maximal Power to 0.
    	List<Propulsor> power_A = new ArrayList<Propulsor>();
    	power_A.add(0, new Propulsor(1,0,0)); // First  Propulsor Rocket A.
    	power_A.add(1, new Propulsor(2,0,0)); // Second Propulsor Rocket A.
    	power_A.add(2, new Propulsor(3,0,0)); // Third  Propulsor Rocket A.
     
    	Rocket rocket_A = new Rocket("32WESSDS",3,power_A); // Building rocket.
               
    	//Rocket B has 6 propulsors. Initializing Current Power and Maximal Power to 0.
    	List<Propulsor> power_B = new ArrayList<Propulsor>();
    	power_B.add(0, new Propulsor(1,0,0)); // First  Propulsor Rocket B.
    	power_B.add(1, new Propulsor(2,0,0)); // Second Propulsor Rocket B.
    	power_B.add(2, new Propulsor(3,0,0)); // Third  Propulsor Rocket B.
    	power_B.add(3, new Propulsor(4,0,0)); // Fourth Propulsor Rocket B.
    	power_B.add(4, new Propulsor(5,0,0)); // Fifth  Propulsor Rocket B.
    	power_B.add(5, new Propulsor(6,0,0)); // Sixth  Propulsor Rocket B.
       
    	Rocket rocket_B = new Rocket("LDSFJA32",6,power_B);
  		 
		int response;
		boolean option = true;
	 
		do {	
				response = (int) type_response();
				switch (response) {
					case 1:
						mng_rocket (rocket_A);
						break;
					case 2:
						mng_rocket (rocket_B);
						break;
					case 0:
						System.out.println("Exit program.");
						option = false;
						break;
					default:
						System.out.println("No key pressed.");
						response = (int) type_response();
						break;	
				}
		} while (option);	
		
	}

}    	
*/    	

//FASE 4

    //Creating 2 rockets : 32WESSDS and LDSFJA32.

    //Rocket A has 3 propulsors. Initializing Current Power and Maximal Power to 0.
    List<Propulsor> power_A = new ArrayList<Propulsor>();
	power_A.add(0, new Propulsor(1,10,100)); // First  Propulsor Rocket A.
	power_A.add(1, new Propulsor(2,20,200)); // Second Propulsor Rocket A.
	power_A.add(2, new Propulsor(3,30,300)); // Third  Propulsor Rocket A.

	Rocket rocket_A = new Rocket("32WESSDS",3,power_A); // Building rocket.
//  	System.out.println("Rocket A has code " + rocket_A.getId_rocket() + " : " + rocket_A.getList_propulsors() + " propulsors.");
       
	//Rocket B has 6 propulsors. Initializing Current Power and Maximal Power to 0.
	List<Propulsor> power_B = new ArrayList<Propulsor>();
	power_B.add(0, new Propulsor(1,10,100)); // First  Propulsor Rocket B.
	power_B.add(1, new Propulsor(2,20,200)); // Second Propulsor Rocket B.
	power_B.add(2, new Propulsor(3,30,300)); // Third  Propulsor Rocket B.
	power_B.add(3, new Propulsor(4,40,400)); // Fourth Propulsor Rocket B.
	power_B.add(4, new Propulsor(5,50,500)); // Fifth  Propulsor Rocket B.
	power_B.add(5, new Propulsor(6,60,600)); // Sixth  Propulsor Rocket B.

	Rocket rocket_B = new Rocket("LDSFJA32",6,power_B);
//	System.out.println("Rocket B has code " + rocket_B.getId_rocket() + " : " + rocket_B.getList_propulsors() + " propulsors.");
 
	int response;
	boolean option = true;
	
	formula(rocket_A);
	System.out.println('\n');
	formula(rocket_B);

    }

}    	