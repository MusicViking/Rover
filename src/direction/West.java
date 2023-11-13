package direction;

import rover.Rover;

public class West implements Direction {
	
	char c = 'E';

	@Override
	public Direction turnRight() {
		return new North();
	}

	@Override
	public Direction turnLeft() {
		return new South();
	}

	@Override
	public void moveForward(Rover rover) {
		rover.setX(rover.getX() - 1);
	}
	
	@Override
	public char getDirection() {
		return c;
	}
    
}
