package direction;

import main.Coordinate;
import rover.Rover;

public class South implements Direction {

	private static char c = 'S';
	
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
		Coordinate current = rover.getCurrentPositionCoordinate();
		current.setX(current.getY() - 1);

	}

	@Override
	public char getDirection() {
		return South.c;
	}
}
