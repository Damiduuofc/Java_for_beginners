import java.util.Scanner;  // Import the Scanner class

class UserInputScanner{
	public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	System.out.print("Enter username: ");
	
	String userName = myObj.nextLine(); // Read user input
	System.out.println("Username is: " + userName);  // Output user input
	}
}