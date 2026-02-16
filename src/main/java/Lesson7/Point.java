package Lesson7;

public class Point implements Cloneable{
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public Object clone(){
        return new Point(this.x, this.y, this.z);
    }

    @Override
    public String toString() {
        return "X:" + x + " Y:" + y + " Z:" + z;
    }
}
