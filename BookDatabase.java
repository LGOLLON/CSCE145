import java.util.Scanner;
public class BookDatabase {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		Bookshelf bk = new BookShelf();
		
		boolean quit = false;
		
		while(quit == false) {
			System.out.println("Welcome to the Gamecock library!" + "\n Enter 1 to add a book" + "\n Enter 2 to reomove a book" + "\n Enter 3 for the book list in the library" + "\nEnter 4 to exit the library:");
			int choice = key.nextInt();
			
			switch(choice) {
			case 1: //adds a book
				System.out.println("Enter the title of the book: ");
				
				String title = key.nextLine();
				
				System.out.println("Enter the author of the book: ");
				
				String author = key.nextLine();
				
				System.out.println("Enter the price of the book: ");
				
				double price = key.nextDouble();
				
				bk.insertBook(title, author, price);
				
				break;
				
			case 2: //removes a book
				System.out.println("Enter the title of the book: ");
				
				title = key.nextLine();
				
				System.out.println("Enter the author: ");
				
				author = key.nextLine();
				
				System.out.println("Enter the price of the book: ");
				
				price = key.nextDouble();
				
				bk.deleteBook(new Book(title, author, price));
				
				break;
			case 3: //view book list
				System.out.println(bk.toString());
				break;
			case 4: //exits the bookshelf
				quit = true;
				break;
			default:
				System.out.println("Invalid choice entered!");
			}
		}

	}

}
