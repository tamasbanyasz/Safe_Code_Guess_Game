package SafeCodeGuessGame;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class DequeClass {
	
	// Lock numbers
	private Deque<Integer> deque = new ArrayDeque<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
	// Deque identifier
	private String name;
	// Middle value of the Deque line
	private Integer value = (deque.size() / 2) + 1;
	
	public DequeClass(String name) {
		this.name = name;
	}
	
	public Integer getValue() {
		return value;
	}
	
	// Rotate left
	public void rotateLeft(UserInputHandler input) {
		
		int num = input.guessInputIsDigit();
		
		if(num > 0) {
			int i = 0;
			do {
				
			    int first = deque.removeFirst();
				deque.addLast(first);
				i++;
				
			} while (i < num);
		} else {
			System.out.println("The line is unchanged.");
		}
  
		System.out.println("-- -- -- --  V  -- -- -- -- ");
		System.out.println(deque);
		
		middleValueOfDeque();	
	}
	
	// Rotate right
	public void rotateRight(UserInputHandler input) {

		int num = input.guessInputIsDigit();
		
		if(num > 0) {
			int i = 0;
			do {
				
			    int last = deque.removeLast();
				deque.addFirst(last);
				i++;
				
			} while (i < num);
		} else {
			System.out.println("The line is unchanged.");
		}

		System.out.println(" -- -- -- -- V  -- -- -- -- -- ");
		System.out.println(deque);
		
		middleValueOfDeque();
	}
	
	// Set the middle value if the line rotated
	private void middleValueOfDeque() {
		int countIndex = 0;
		Iterator<Integer> iterator = deque.iterator();
		while (countIndex < (deque.size() / 2) + 1) {
			value = iterator.next();
			countIndex++;
		}	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("The "+ name + ". deque: " + deque);

		return builder.toString();
	}
}
