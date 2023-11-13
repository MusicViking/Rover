package rover;
import main.Coordinate;
import main.Grid;
import java.util.LinkedList;
import java.util.List;
import direction.Direction;

public class Rover {
	
	private Coordinate currentPosition;
	private Grid grid;
	private Direction direction;
	private List<Coordinate> obstaclesEncountered;

	public Rover(int x, int y, Direction direction, Grid grid){
		this.currentPosition = new Coordinate(x, y);
		this.direction = direction;
		this.grid = grid;
		this.obstaclesEncountered = new LinkedList<>();
	}
	
	public void turnLeft() {
		this.direction = this.direction.turnLeft();
	}

	public void turnRight() {
		this.direction = this.direction.turnRight();
	}
	
	public void moveForward() throws RoverOutOfGridException {
		try {
			this.direction.moveForward(this, this.grid);
		} catch (RoverEncounteredObstacleException e) {
			//
		}
		if (this.currentPosition.getX() < 0 || this.currentPosition.getY() < 0 || this.currentPosition.getX() > grid.getEndBoundaryCoordinate().getX() || this.currentPosition.getY() > grid.getEndBoundaryCoordinate().getY()) {
			throw new RoverOutOfGridException();
		}
	}

	public Coordinate getCurrentPositionCoordinate() {
		return this.currentPosition;
	}

	public char getCurrentDirection() {
		return this.direction.getDirection();
	}

	public void rememberObstacle(Coordinate obstacle) {
		this.obstaclesEncountered.add(obstacle);
	}

	public void statusReport() {
		String obstacleString = this.obstaclesEncountered.isEmpty() ? "No Obstacles detected" : this.obstaclesEncountered.toString();
		System.out.println("Rover is at " + this.getCurrentPositionCoordinate() + " facing " + this.getCurrentDirection() + ". " + obstacleString + ".");
	}

}
