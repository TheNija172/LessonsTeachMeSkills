package Test;

public abstract class Shape implements Comparable<Shape> {
    public abstract double getPerimetr();

    public abstract double getArea();

    @Override
    public int compareTo(Shape o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        }
        return 0;
    }
}
