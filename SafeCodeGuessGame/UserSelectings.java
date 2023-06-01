package SafeCodeGuessGame;

public class UserSelectings {
	
	private DequeClass selected;
	
	// User selecting Deque lines by numbers. Every number is a Deque line.
	public DequeClass selectDeque(DequeClass deque1, DequeClass deque2, DequeClass deque3, DequeClass deque4, UserInputHandler input) {
		 
		 switch (input.selectDeque()) {
         case 1:
        	 selected = deque1;
             break;
             
         case 2:
        	 selected = deque2;
             break;
             
         case 3:
        	 selected = deque3;
             break;
             
         case 4:
        	 selected = deque4;
             break;
         
         default: break;
		 };
		 
		System.out.println(selected);
		return selected;
		 
	 }
	
	// User selecting which way would to rotate 
	public void selectRotateWay(UserInputHandler input, DequeClass selected) {
		
		switch (input.selectRotateWay()) {
		case "left":
			selected.rotateLeft(input);;
            break;
            
        case "right":
        	selected.rotateRight(input);;
            break;
		}
	}
}
