package com.app;

import java.util.Scanner;
import com.characters.*;

public class app {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean userInputCorrect = false;
		
		HumanWizzard ourHumanWizzard = new HumanWizzard();
		ourHumanWizzard = ourHumanWizzard.makeHumanWizard();
		System.out.println(ourHumanWizzard.getHealth());
		System.out.println(ourHumanWizzard.getWeapon());
		System.out.println(ourHumanWizzard.getMagic());
		System.out.println(ourHumanWizzard.getName());
		
		
		System.out.println("\n\n\n");
		System.out.println("Welcome to Silly D 'n' D\n\n");
				
		do{
		System.out.println("Would you like to play as a:\n" +
				" 1) Human Wizard\n" +
				" 2) Elf Royal\n" +
				" 3) Twi'lek Jedi\n" +
				" 4) Smurf Warrior\n" +
				" 5) Turtle Ninja");

		String userInput = sc.nextLine();
		
		
		switch (userInput) {
		case "1":
			//Call to humanWizard methods here
			break;
			
		case "2":
			//Call to elfRoyal methods here
			break;
			
		case "3":
			//Call to twi'lekJedi methods here
			break;
		
		case "4":
			//Call to smurfWarrior methods here
			break;
		
		case "5":
			//Call to turtleNinja methods here
			break;

		default:
			System.out.println("You're input was invalid.  Please enter valid input.\n\n");
			break;
			}
		} while (userInputCorrect);
	} 
}
