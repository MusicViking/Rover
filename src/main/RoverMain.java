package main;
import direction.Direction;
import direction.East;
import direction.West;
import rover.Rover;
import rover.RoverOutOfGridException;
import direction.North;
import direction.South;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RoverMain {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(new File("src/inputs/input.txt"));

            String[] arr = scan.nextLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            Grid grid = new Grid(x, y);

            arr = scan.nextLine().split(" ");
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[1]);
            Direction direction;
            switch (arr[2]) {
                case "E": direction = new East(); break;
                case "W": direction = new West(); break;
                case "N": direction = new North(); break;
                case "S": direction = new South(); break;
                default: direction = null; break;
            }
            
            char[] commands = scan.nextLine().toCharArray();
            
            String[] obstacles = scan.nextLine().split(" ");
            for (String obstacle : obstacles) {
                String[] coords = obstacle.split(", ?");
                int first = Integer.parseInt(coords[0]);
                int second = Integer.parseInt(coords[1]);
                grid.addObstacle(new Coordinate(first, second));
            }
            
            Rover rover = new Rover(x, y, direction, grid);

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

            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}
