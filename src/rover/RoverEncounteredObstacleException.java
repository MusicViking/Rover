package rover;

public class RoverEncounteredObstacleException extends Exception{
    public RoverEncounteredObstacleException() {
        super("Can't move rover. Obstacle ahead!");
    }
}
