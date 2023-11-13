package rover;
import main.Grid;
import direction.Direction;

public class Rover {
	
	private int x;
	private int y;
	private Grid grid;
	private Direction direction;

	public Rover(int x, int y, Direction direction, Grid grid){
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.grid = grid;
	}
	
	// boolean isObstacle(int x,int y) {
	// 	for(int i=0;i<this.obstacles.size();i++) {
	// 		if(x == obstacles.get(i)[0] && y == obstacles.get(i)[1]) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }
	
	public void turnLeft() {
		this.direction = this.direction.turnLeft();
	}

	public void turnRight() {
		this.direction = this.direction.turnRight();
	}
	
	public void moveForward() throws RoverOutOfGridException {
		this.direction.moveForward(this);
		if (this.x < 0 || this.y < 0 || this.x > grid.getX() || this.y > grid.getY()) {
			throw new RoverOutOfGridException();
		}
	}
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
