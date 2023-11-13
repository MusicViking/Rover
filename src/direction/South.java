package direction;

import rover.Rover;

public class South implements Direction {

	char c = 'S';
	
	@Override
	public Direction turnRight() {
		return new West();
	}

	@Override
	public Direction turnLeft() {
		return new East();
	}

	@Override
	public void moveForward(Rover rover) {
		rover.setY(rover.getY() - 1);

	}

	@Override
	public char getDirection() {
		return c;
	}
}
