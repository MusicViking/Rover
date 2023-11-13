package direction;
import rover.Rover;

public interface Direction {

    public Direction turnLeft();

    public Direction turnRight();

    public void moveForward(Rover rover);

    public char getDirection();
}
