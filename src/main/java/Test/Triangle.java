package Test;

public class Triangle extends Shape{
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = getPerimetr() / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
