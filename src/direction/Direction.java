package direction;
import main.Grid;
import rover.Rover;

public interface Direction {

    public Direction turnLeft();

    public Direction turnRight();

    public void moveForward(Rover rover, Grid grid);

    public char getDirection();
}
