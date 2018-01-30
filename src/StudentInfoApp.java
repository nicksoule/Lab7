/*
 * Nick Soule
 * 1/29/2018
 * Java.Lab7
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInfoApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		int n;
		String fact1;

		while (cont.equalsIgnoreCase("y")) {
			try {
				System.out.println("Welcome to our Java Class. Which student would you like to learn more about?"
						+ " Please enter a number 1-5.");
				n = scan.nextInt();
				scan.nextLine();
				System.out.println("Student " + n + " is " + getName(n) + ".");
				System.out.println("What would you like to know about " + getName(n) + "? Enter either hometown or color.");
				fact1 = scan.nextLine();
				if (fact1.equalsIgnoreCase("hometown")) {
					System.out.println(getFact1(n));
				} else if (fact1.equalsIgnoreCase("color")) {
					System.out.println(getFact2(n));
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid entry. Please enter a valid integer.");
				scan.nextLine();
				continue;
			} 
			

			System.out.println("Would you like to continue? y/n");
			cont = scan.nextLine();

		}
		scan.close();

	}
	
	// method that gets the name based off of the number selected
	public static String getName(int n) { 
		String[] name = { "John", "Nick", "Jacuqi", "Amanda", "Aret" };
		String getName = name[n - 1];
		return getName;
	}
	
	// method that retrieves the hometown fact attached to person/number selected
	public static String getFact1(int n) { 
		String[] homeTown = { "Ypsilanti, MI", "Rockford, IL", "Detroit, MI", "Holland, MI", "Istanbul" };
		String getFact1 = homeTown[n - 1];
		return getFact1;
	}

	// method that retrieves the favorite color fact attatched to the person/number selected
	public static String getFact2(int n) {
		String[] faveColor = { "Red", "Blue", "Green", "Orange", "Red" };
		String getFact2 = faveColor[n - 1];
		return getFact2;
	}

}
