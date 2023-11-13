package direction;

import rover.Rover;

public class East implements Direction {
	
	char c = 'E';

	@Override
	public Direction turnRight() {
		return new South();
	}

	@Override
	public Direction turnLeft() {
		return new North();
	}

	@Override
	public void moveForward(Rover rover) {
		rover.setX(rover.getX() + 1);
	}
	
	@Override
	public char getDirection() {
		return c;
	}
    
}
