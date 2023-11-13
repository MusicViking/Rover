package rover;

public class RoverEncounteredObstacleException extends Exception{

    private static final int ERROR_CODE  = 2;

    public RoverEncounteredObstacleException() {
        super("Can't move rover. Obstacle ahead!");
    }

    @Override
    public String toString() {
        return super.getMessage() + "Error Code: " + ERROR_CODE;
    }
}
