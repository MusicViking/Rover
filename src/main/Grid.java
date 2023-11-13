package main;
import java.util.HashSet;

public class Grid {

    private Coordinate endBoundary;
    private HashSet<Coordinate> obstacles;

    public Grid(int x, int y) {
        this.endBoundary = new Coordinate(x, y);
        this.obstacles = new HashSet<>();
    }

    public Coordinate getEndBoundaryCoordinate() {
        return this.endBoundary;
    }

    // public boolean isObstacle(int x, int y) {
    //     for (Coordinate obs : obstacles) {
    //         if (obs.getX() == x && obs.getY() == y) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }


}
