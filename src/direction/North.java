package direction;

import main.Coordinate;
import main.Grid;
import rover.Rover;
import rover.RoverEncounteredObstacleException;

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
	public void moveForward(Rover rover, Grid grid) throws RoverEncounteredObstacleException {
		Coordinate current = rover.getCurrentPositionCoordinate();
		current.setX(current.getY() + 1);
		if (grid.isObstacle(current)) {
			current.setX(current.getY() - 1);
			throw new RoverEncounteredObstacleException();
		}
	}

	@Override
	public char getDirection() {
		return North.c;
	}
}
