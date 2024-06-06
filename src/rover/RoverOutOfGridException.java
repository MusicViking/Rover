package rover;

public class RoverOutOfGridException extends Exception {

	private static final int ERROR_CODE  = 1;

    public RoverOutOfGridException() {
		super("The Rover has crossed the boundary!");
	}

	@Override
    public String toString() {
        return super.getMessage() + "Error Code: " + ERROR_CODE;
    }
    
}