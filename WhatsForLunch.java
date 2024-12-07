import java.util.Scanner;

public class WhatsForLunch {

	public static void main(String[] args) {
		
		//Single line comment
		
		/*
		 * Multi-line 
		 * comment
		 */
		
		//print a message on the console
		System.out.println("Welcome to my first Java program!\n");
		
		/*
		 * Escape Characters
		 * 		\n - new line
		 * 		\" - double quote
		 */
		
		System.out.println("\"JAVA\" is fun!");
		
		//creates a Scanner object
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("What\'s for lunch today? Enter entree:");
		
		String entree;		//declare a variable
		
		entree = key.nextLine();
		
		// + concatenation(join) operator
		// = assignment operator
		
		System.out.println("Enter side and drink: ");
		
		String side = key.next();
		
		String drink = key.nextLine();
		
		System.out.println("Entree: " + entree);
		
		System.out.println("Side: " + side);
		
		System.out.println("Drink: " + drink);
	}

}