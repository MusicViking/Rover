package rover;

public class RoverOutOfGridException extends Exception {

    public RoverOutOfGridException() {
		super("The Rover has crossed the boundary!");
	}
}