package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
	enterBallot();
	
		
	}
	private void enterBallot() {
		if(frontIsClear()) {
			move();
			checkMiddle();
		}
		}
	
	private void checkMiddle() {
		if(beepersPresent()) {
			move();
			enterBallot();
			}
		else {
			turnLeft();
			move();
			
			checkTop();
			}	
		}
	private void checkTop() {
		while(beepersPresent()) {
			pickBeeper();
		}
		moveToBottom();
	}
	private void moveToBottom() {
		turnAround();
		move();
		move();
		checkBottom();
		}
	private void checkBottom() {
		while (beepersPresent()) {
			pickBeeper();
		}
		moveToNext();
	}
	private void moveToNext() {
		turnAround();
		move();
		turnRight();
		move();
		enterBallot();
	}
	
}
