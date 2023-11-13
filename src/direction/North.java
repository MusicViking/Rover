package direction;

import rover.Rover;

public class North implements Direction {

	private static char c = 'N';
	
	@Override
	public Direction turnRight() {
		return new East();
	}

	@Override
	public Direction turnLeft() {
		return new West();
	}

	@Override
	public void moveForward(Rover rover) {
		rover.setY(rover.getY() + 1); 
	}

	@Override
	public char getDirection() {
		return North.c;
	}
}
