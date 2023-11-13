package direction;

import main.Coordinate;
import main.Grid;
import rover.Rover;

public class East implements Direction {
	
	private static char c = 'E';

	@Override
	public Direction turnRight() {
		return new South();
	}

	@Override
	public Direction turnLeft() {
		return new North();
	}

	@Override
	public void moveForward(Rover rover, Grid grid) {
		Coordinate current = rover.getCurrentPositionCoordinate();
		current.setX(current.getX() + 1);
		if (grid.isObstacle(current)) {
			current.setX(current.getX() - 1);
		}
	}
	
	@Override
	public char getDirection() {
		return East.c;
	}
    
}
