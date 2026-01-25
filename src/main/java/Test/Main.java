package Test;

/*
Сделать фигуры разные, у них считать площадь и реализовать интерфейс
Comparable для сравнения площадей фигур.
Например, квадрат (S=a*a), прямоугольник (S=a*b),
треугольник (S = √(p(p - a)(p - b)(p - c)), где p — полу периметр), круг (S = πr²).
*/

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(2, 3, 4);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println(circle.compareTo(triangle));
    }
}
