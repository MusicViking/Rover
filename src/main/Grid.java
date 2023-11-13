package main;
import java.util.HashSet;
import java.util.Set;

public class Grid {

    private Coordinate endBoundary;
    private Set<Coordinate> obstacles;

    public Grid(int x, int y) {
        this.endBoundary = new Coordinate(x, y);
        this.obstacles = new HashSet<>();
    }

    public Coordinate getEndBoundaryCoordinate() {
        return this.endBoundary;
    }

    public void addObstacle(Coordinate obstacle) {
        this.obstacles.add(obstacle);
    }

    public boolean isObstacle(Coordinate point) {
        for (Coordinate coords: this.obstacles){
            if (coords.equals(point)) {
                return true;
            }
        }
        return false;
    }


}
