package direction;
import main.Grid;
import rover.Rover;
import rover.RoverEncounteredObstacleException;

public interface Direction {

    public Direction turnLeft();

    public Direction turnRight();

    public void moveForward(Rover rover, Grid grid) throws RoverEncounteredObstacleException;

    public char getDirection();
}
