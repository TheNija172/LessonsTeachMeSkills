package Test;

/*
Создать интерфейс IShape с методом getSquare(int x, int y). Используя лямбда-
выражения, реализовать его для квадрата(a*b) и треугольника(0.5a*h)
* */

/*
При помощи лямбда выражения реализовать логику, при которой, если а < b, то вернуть
а. Если a > b, то вернуть b. Иначе вернуть 0.
*/

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        secondTask();
    }

    public static void firstTask() {
        IShape square = (x, y) -> x*y;
        IShape triangle = (x, y) -> x*y*0.5;

        System.out.println(square.getSquare(1, 2));
        System.out.println(triangle.getSquare(1, 2));
    }

    public static void secondTask() {
        BiFunction<Double, Double, Double> compare = (a, b) -> {
            if (a > b)
                return b;
            else if (a < b)
                return a;
            else
                return 0d;
        };

        System.out.println(compare.apply(2d, 2d));
    }
}


