package SafeCodeGuessGame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckLock {
	
	private ArrayList<Boolean> locks = new ArrayList<Boolean>(List.of(false, false, false, false));
	
	// Check the middle value of the each lines are equal the lock numbers.
	// Deque lines are equal the lock numbers indexes.
	public void checkLockNumber(Integer midValueOfDeque1, 
								   Integer midValueOfDeque2, 
								   Integer midValueOfDeque3, 
								   Integer midValueOfDeque4, 
								   int[] lockCodes) {
		
		int[] midValues = new int[]{midValueOfDeque1, midValueOfDeque2, midValueOfDeque3, midValueOfDeque4};
		
		for (int i = 0; i < midValues.length; i++) {
			for (int j = 0; j < lockCodes.length; j++) {
				if (midValues[i] == lockCodes[i]) {
					locks.set(i, true);
				} else {	
					locks.set(i, false);
				}		
			}
		}
		System.out.println("---------------------------------------------");
		System.out.println("Your numbers: " + Arrays.toString(midValues));
		System.out.println("Lock code: " + Arrays.toString(lockCodes));
		System.out.println("Opened lines: " + locks);
		System.out.println("---------------------------------------------");
	}
	
	// If named "locks" ArrayList contains "false"s, the lock still locked.
	// If all element are "true", the lock opened.
	public boolean ifAllLinesOpened() {
		boolean locked = locks.contains(false);
		 
        if (locked) {
            System.out.println("*LOCKED*");
        	return false;
        } else {
        	System.out.println("---------------------------------------------");
            System.out.println("*YOU WIN!*");
            return true;
        }
	}
}
