package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            firstTask(sc);
            secondTask(sc);
            thirdTask();
            fourthTask();
            fifthTask(sc);
        }
    }

    //----------Task 1----------
    private static void firstTask(Scanner sc) {
        System.out.print("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.print("Повторите ввод значения: ");
            sc.next();
        }

        if (sc.nextInt() % 2 == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
        System.out.println();
    }

    //-----------Task 2-----------
    private static void secondTask(Scanner sc) {
        System.out.print("Введите температуру: ");

        while (!sc.hasNextInt()) {
            System.out.print("Повторите ввод значения: ");
            sc.next();
        }

        int temperature = sc.nextInt();

        if (temperature <= -20)
            System.out.println("Холодная погода");
        else if (temperature > -5)
            System.out.println("Теплая погода");
        else
            System.out.println("Нормальная погода");
        System.out.println();
    }

    //------Task 3------
    private static void thirdTask() {
        System.out.print("Квадраты чисел от 10 до 20: ");
        for (int i = 10; i <= 20; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println('\n');

    }

    //------Task 4------
    private static void fourthTask() {
        System.out.print("Числа от 7 до 98: ");
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println('\n');
    }

    //------Task 5------
    private static void fifthTask(Scanner sc) {
        int value;
        int sum = 0;
        System.out.print("Введите целочисленное число: ");

        while (true) {
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value < 0) {
                    System.out.print("Повторите ввод значения: ");
                    continue;
                } else
                    break;
            }
            System.out.print("Повторите ввод значения: ");
            sc.next();
        }

        for (int i = 1; i <= value; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}