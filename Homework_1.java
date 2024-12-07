//Luke Gollon
import java.util.Scanner;
public class Homework_1 {
	public static final int year = 2024;
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		//Asks for and stores the users first name
		System.out.println("Please enter your first name: ");
		String first_name = key.nextLine();
		
		//Asks for and stores the users last name
		System.out.println("Please enter your last name");
		String last_name = key.nextLine();
		
		//Asks for and stores the users age
		System.out.println("Please enter your age (in years): ");
		int age = key.nextInt();
		key.nextLine();
		
		//Asks for and stores the users phone number
		System.out.println("Please enter your phone number (without any dashes or parenthesis): ");
		String phone_num = key.nextLine();
		
		//Asks for and stores the users major
		System.out.println("Please enter your major: ");
		String major = key.nextLine();
		
		//Asks for and stores the users academic year
		System.out.println("Please enter your academic year (freshman, sophmore, junior, senior): ");
		String academic = key.nextLine();
		
		//Asks for and stores the present date
		System.out.println("Please enter today's date (mm/dd/yyyy): ");
		String date = key.nextLine();
		
		//Asks for and stores what instrument the user plays
		System.out.println("Please enter an instrument you play: ");
		String instrument = key.nextLine();
		
		//Asks for and stores the users dream destination
		System.out.println("Please enter your dream destination: ");
		String destination = key.nextLine();
		
		//Asks for and stores the users lucky number
		System.out.println("Please enter your lucky number: ");
		String number = key.nextLine();
		
		//Creates and formats data to display properly
		String month = date.substring(0, 2);
		String day = date.substring(3, 5);
		String current_year = date.substring(6, 10);
		String euro_date = day + "." + month + "." + current_year;
		int birth_year = year - age;
		String area_code = phone_num.substring(0, 3);
		String firstThreePN = phone_num.substring(3, 6);
		String lastFourPN = phone_num.substring(6, 10);
		String phone_number = "(" + area_code + ")" + firstThreePN + "-" + lastFourPN;
		
		//Intro
		System.out.println("Here's a quick intro for " + first_name + " " + last_name + ":\n \n	You were born in the year " + birth_year + ". In your free time, you love to play the " + instrument + ". \nYou want to visit " + destination + ", and your lucky number is " + number + ". You are a " + academic + " at USC majoring \nin " + major + ". You can be reached at " + phone_number + ". You are officially a Gamecock!\n\nLast Updated: " + euro_date);
	}

}
