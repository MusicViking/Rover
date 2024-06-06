package rover;
import main.Coordinate;
import main.Grid;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import direction.Direction;

public class Rover {
	
	private Coordinate currentPosition;
	private Grid grid;
	private Direction direction;
	private List<Coordinate> obstaclesEncountered;
	private Logger roverLogs = Logger.getLogger(Rover.class.getName());

	public Rover(int x, int y, Direction direction, Grid grid){
		this.currentPosition = new Coordinate(x, y);
		this.direction = direction;
		this.grid = grid;
		this.obstaclesEncountered = new LinkedList<>();
		roverLogs.info("Started rover.");
	}
	
	public void turnLeft() {
		this.direction = this.direction.turnLeft();
		roverLogs.info("Rover turned left.");
	}

	public void turnRight() {
		this.direction = this.direction.turnRight();
		roverLogs.info("Rover turned right.");
	}
	
	public void moveForward() throws RoverOutOfGridException {
		try {
			this.direction.moveForward(this, this.grid);
		} catch (RoverEncounteredObstacleException e) {
			roverLogs.warning("Encountered an obstacle at " + obstaclesEncountered.get(obstaclesEncountered.size() - 1));
		}
		if (this.currentPosition.getX() < 0 || this.currentPosition.getY() < 0 || this.currentPosition.getX() > grid.getEndBoundaryCoordinate().getX() || this.currentPosition.getY() > grid.getEndBoundaryCoordinate().getY()) {
			roverLogs.warning("Rover out of boundary");
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
		String message = "Rover is at " + this.getCurrentPositionCoordinate() + " facing " + this.getCurrentDirection() + ". " + obstacleString + ".";
		roverLogs.info(message);
	}

}
