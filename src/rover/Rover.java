package rover;
import main.Grid;
import java.util.*;

public class Rover {
	
	private int initialX;
	private int initialY;
	private Grid grid;
	
	char direction;
	
	final int maxX;
	final int maxY;
	
	ArrayList<int[]> obstacles = new ArrayList<>();

	public Rover(int initialX, int initialY, char direction, Grid grid){
		this.initialX = initialX;
		this.initialY = initialY;
		this.direction = direction;
		this.grid = grid;
	}
	
	public Rover(int initialX, int initialY, char direction, int maxX, int maxY){
		this.initialX = initialX;
		this.initialY = initialY;
		this.direction = direction;
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	boolean isObstacle(int x,int y) {
		for(int i=0;i<this.obstacles.size();i++) {
			if(x == obstacles.get(i)[0] && y == obstacles.get(i)[1]) {
				return true;
			}
		}
		return false;
	}
	
	char turn(char command) {
		
		Map<Character, char[]> dict = new HashMap<>();
		dict.put('N', new char[]{'W', 'E'});
        dict.put('W', new char[]{'S', 'N'});
        dict.put('S', new char[]{'E', 'W'});
        dict.put('E', new char[]{'N', 'S'});
        
        
        if(command == 'L') {
        	return dict.get(direction)[0];
        }
        else {
        	return dict.get(direction)[1];
        }
		
		
	}
	
	public void move(char command) {
		
		
		if(command == 'M') {
		
			switch(direction) {
			
			case 'E':
				if(!this.isObstacle(initialX+1,initialY)) {
					initialX+=1;
				}
				break;
			
			case 'W':
				if(!this.isObstacle(initialX-1, initialY)) {
					initialY -= 1;
				}
				break;
			
			case 'N':
				if(!this.isObstacle(initialX, initialY+1)) {
					initialY += 1;
				}
				break;
			case 'S':
				if(!this.isObstacle(initialX, initialY-1)) {
					initialY = initialY-1;
				}
				break;
			default:
				 System.out.println("Invalid direction");
			}
		}
		
		else {
			direction = this.turn(command);
		}
	}
	

	

}
