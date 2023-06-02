package SafeCodeGuessGame;
import java.util.Scanner;

public class UserInputHandler {
	
	private final Scanner scanner;
	
	public UserInputHandler(Scanner scanner) {
		this.scanner = scanner;
	}
	
	// User selecting a Deque line by number.
	public int selectDeque() {
		boolean correctUserInput;
		String userInput;
		
		do {
			System.out.println("Select deque: ");
			userInput = scanner.nextLine();
			correctUserInput = true;
			if (!userInput.matches("^[1-4]{1}")) {
				System.out.println("Invalid input!");
				correctUserInput = false;
			}
		} while (!correctUserInput);
		
		int userNumber = Integer.parseInt(userInput);
		return userNumber;
	}
	
	// User add a number to how many indexes want to rotate the choosed array with.
	public int guessInputIsDigit() {
		boolean correctUserInput;
		String userInput;
		
		do {
			System.out.println("With how many indexes want to rotate: ");
			userInput = scanner.nextLine();
			correctUserInput = true;
			if (!userInput.matches("^[0-9]{1}")) {
				System.out.println("Invalid input!");
				correctUserInput = false;
			}
		} while (!correctUserInput);
		
		int userNumber = Integer.parseInt(userInput);
		return userNumber;
		
	}
	
	// Select the rotate way. To left or right
	public String selectRotateWay() {
		boolean correctUserInput;
		String userInput;
		
		do {
			System.out.println("Select rotate way ('left' | 'right'): ");
			userInput = scanner.nextLine();

			correctUserInput = false;
			if (userInput.toLowerCase().equals("left") || userInput.toLowerCase().equals("right")) {
				System.out.println("Valid way!!");
				correctUserInput = true;
			} else {
				System.out.println("Invalid way!!");
			}
		} while (!correctUserInput);
		
		return userInput.toLowerCase();
	}
}
