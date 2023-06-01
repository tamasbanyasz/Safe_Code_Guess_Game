package SafeCodeGuessGame;
import java.util.Random;

// Create the lock code
public class SafeCode {
	
	private Random random = new Random();
	private int[] codes =  new int[4];
	
	public int[] numbers() {
		for (int i = 0; i < codes.length; i++) {
			int number = random.nextInt(1, 10);
			codes[i] = number;
		}
		return codes;
	}
}
