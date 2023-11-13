package main;

public class Obstacle implements Coordinate{

    private int x;
    private int y;

    public Obstacle(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

}
