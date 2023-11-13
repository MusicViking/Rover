package main;
import java.util.HashSet;

public class Grid {

    private int x;
    private int y;
    private HashSet<Obstacle> obstacles;

    public Grid(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    


}
