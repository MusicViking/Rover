package main;

public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
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

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Coordinate) && (((Coordinate)obj).getX() == this.getX() && ((Coordinate)obj).getY() == this.getY());
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(this.getX() % Integer.MAX_VALUE + "" + this.getY() % Integer.MIN_VALUE);
    }

}
