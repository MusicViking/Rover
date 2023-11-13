package test;

import direction.Direction;
import direction.North;
import main.Grid;
import rover.Rover;
import rover.RoverOutOfGridException;

public class RoverTest {    
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        Direction direction = new North();
        Rover rover = new Rover(0, 0, direction, grid);
        char[] commands = {'M','M','R','M','L','M'};
        for (char command: commands) {
            switch (command) {
                case 'M':
                    try {
                        rover.moveForward();
                    } catch (RoverOutOfGridException e) {
                        break;
                    }
                    break;
                case 'L':
                    rover.turnLeft();
                    break;
                case 'R':
                    rover.turnRight();
                    break;
                default:
                    break;
            }
        }
        rover.statusReport();
    }
}
