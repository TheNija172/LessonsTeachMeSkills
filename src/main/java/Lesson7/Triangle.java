package Lesson7;

public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
