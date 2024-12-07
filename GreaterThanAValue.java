import java.util.Scanner;
public class GreaterThanAValue {
	
	public static final int VALUE = 1000;
	
	public static void main(String[] args) {
		// package - a library of classes that have been pre-defined
		// eg: Scanner
		
		Scanner key = new Scanner(System.in); // creating a scanner object
		
		System.out.println("Enter an integer: "); //asking the user for input value
		
		int number = key.nextInt();
		
		if(number > VALUE) {
			// if-block
			System.out.println("The number you entered is greater than 1000!");
		} else {
			// else-block
			System.out.println("The number you entered is not greater than 1000!");
		}
	}
}
