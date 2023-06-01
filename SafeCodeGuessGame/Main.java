package SafeCodeGuessGame;
import java.util.Scanner;

/*------------ Guess the Safe Code game ------------
 * 
 * Have 4 lines of Deque. Every Deque contain numbers 1-9 and it's identifier.
 * The user choose a line by number then choose a rotate way and with how many indexes want to do this.
 * If all middle value of the lines are equal the safe code, the safe will be open and the user win the game.
 * 
 */

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			new Main().run(scanner);
		}	
	}

	private void run(Scanner scanner) {
		
	boolean gameEvent = true;	
	
	// Create the 4 Deque line
	DequeClass deque1 = new DequeClass("1");
	DequeClass deque2 = new DequeClass("2");
	DequeClass deque3 = new DequeClass("3");
	DequeClass deque4 = new DequeClass("4");


	UserSelectings selectings = new UserSelectings();
	UserInputHandler in = new UserInputHandler(scanner);
	
	SafeCode code = new SafeCode();
	int[] nums = code.numbers();
	
	CheckLock checkLock = new CheckLock();
	
	// Game loop
	while (gameEvent) {
		System.out.println("---------------------------------------------");
		System.out.println("              |-- -- -- --| |-- -- -- --|");
		System.out.println(deque1);
		System.out.println(deque2);
		System.out.println(deque3);
		System.out.println(deque4);
		System.out.println("              |-- -- -- --| |-- -- -- --|");
		System.out.println("---------------------------------------------");
		
		
		DequeClass selected = selectings.selectDeque(deque1, deque2, deque3, deque4, in);
		selectings.selectRotateWay(in, selected);
		
		
		checkLock.checkLockNumber(deque1.getValue(), deque2.getValue(), deque3.getValue(), deque4.getValue(), nums);
		if (checkLock.ifAllLinesOpened()) {
			gameEvent = false;
		}
	}	
	
	System.out.println("-Safe is open!-");	
		
	}
}
