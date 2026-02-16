package Lesson7;

/*
Задача 1:
Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные
классы.
*/

/*
Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве.
*/

/*
Задача 3:
Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.
*/

public class Main {
    //-----Main-----
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }

    //-----Task 1-----
    public static void firstTask() {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printJobTitle();
        worker.printJobTitle();
        accountant.printJobTitle();
    }

    //-----Task 2-----
    public static void secondTask() {
        Shape[] shapes = {
                new Triangle(1, 2, 3),
                new Rectangle(4, 5),
                new Circle(6),
                new Triangle(7, 8, 9),
                new Rectangle(10, 11)
        };

        double pSum = 0;
        double areaSum = 0;

        for (Shape shape : shapes) {
            pSum += shape.getPerimeter();
            areaSum += shape.getArea();
        }

        System.out.println("Сумма периметров: " + pSum);
        System.out.println("Сумма площадей: " + areaSum);
    }

    //-----Task 3-----
    public static void thirdTask(){
        Point point1 = new Point(1, 1 , 1);
        Point point2 = new Point(2, 2, 2);
        System.out.println("Точки до клонирования: ");
        System.out.println("Первая (" + point1 + ")");
        System.out.println("Вторая (" + point2 + ")");

        point2 = point1;
        System.out.println("Точки после клонирования: ");
        System.out.println("Первая (" + point1 + ")");
        System.out.println("Вторая (" + point2 + ")");
    }
}
