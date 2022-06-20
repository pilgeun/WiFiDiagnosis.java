/*
 * Class: CMSC203 CRN 4519
 * Instructor: Farnaz Eivazi
 * Description: Asks series of questions to help User diagnose and connect to their WiFi.
 * Due: 6/21/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Philip Song
*/

//package cmsc203Assignment1;
import java.util.Scanner;

public class WiFiDiagnosis {
	
	public static void main(String[] args) {
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		
		wifi_help();	// asks the WiFi Diagnosis questions, returns here if User says problem is fixed, or says no to all questions
		
		System.out.println("\nPROGRAMMER: Philip Song");
	}
	
	
	public static void wifi_help() {	// Goes through steps to diagnosis WiFI issue, stops any time User says "yes"
		
		Scanner keyboard = new Scanner(System.in);
		String input;	// stores User's answer to each question
		
		System.out.println("First step: reboot your computer");		
		System.out.println("Are you able to connect with the internet? (yes or no)");
		input = keyboard.nextLine();
		
		// Except for "Yes" or "y" (any case), any other input is considered "no"
		if (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")) {
			System.out.println("Rebooting your computer seemed to work");
			keyboard.close(); 
			return;
		}
		
		System.out.println("Second step: reboot your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		input = keyboard.nextLine();
		
		if (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")) {
			System.out.println("Rebooting your router seemed to work");
			keyboard.close(); 
			return;
		}
		
		System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		input = keyboard.nextLine();
		
		if (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")) {
			System.out.println("Plugging in cables seemed to work");
			keyboard.close(); 
			return;
		}
		
		System.out.println("Fourth step: move your computer closer to your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		input = keyboard.nextLine();
		
		if (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")) {
			System.out.println("Moving your computer seemed to work");
			keyboard.close(); 
			return;
		}
		
		System.out.println("Fifth step: contact your ISP");
		System.out.println("Make sure your ISP is hooked up to your router");
		keyboard.close(); 
	}

}
