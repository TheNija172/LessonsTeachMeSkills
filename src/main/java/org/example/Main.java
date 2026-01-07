package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu;
        try (Scanner scanner = new Scanner(System.in)) {

            int[] array = creatingArray(scanner);
            while (true) {
                System.out.println("Выберите действие: ");
                System.out.println("0. Выход");
                System.out.println("1. Задание 1");
                System.out.println("2. Задание 2");
                System.out.println("3. Задание 3");
                System.out.println("4. Задание 4");
                System.out.println("5. Задание 5");


                while (!scanner.hasNextInt()) {
                    System.out.println("Неверный ввод данных");
                    scanner.next();
                }

                menu = scanner.nextInt();

                switch (menu) {
                    case 0 -> {
                        return;
                    }
                    case 1 -> {
                        FirstTask(array);
                    }
                    case 2 -> {

                    }
                    case 3 -> {

                    }
                    case 4 -> {

                    }
                    case 5 -> {

                    }
                    default -> {

                    }
                }
            }
        }
    }


    //-----Task 1-----
    public static void FirstTask(int[] array) {

        System.out.print("В прямом порядке: [ ");
        for (int element: array)
        {
            System.out.print(element + " ");
        }
        System.out.println("]");
        System.out.print("В обратном порядке: [");
        for (int i = array.length-1; i >=0; i--)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }


    //-----Creating array-----
    public static int[] creatingArray(Scanner scanner) {
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Повторите ввод: ");
            scanner.next();
        }
        int[] array = new int[scanner.nextInt()];


        System.out.println("Выберите действие: ");
        System.out.println("1. Ввод массива вручную");
        System.out.println("2. Случайная генерация массива");
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Повторите ввод: ");
                scanner.next();
            }

            switch (scanner.nextInt()) {
                case 1 -> {
                    for(int i = 0; i<array.length; i++)
                    {
                        System.out.print("Введите " + (i+1) + " элемент: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Повторите ввод: ");
                            scanner.next();
                        }
                        array[i] = scanner.nextInt();
                    }
                    return array;
                }
                case 2 -> {
                    for (int i = 0; i<array.length; i++)
                    {
                        array[i] = random.nextInt(1, 50);
                    }
                    return array;
                }
                default -> {
                    System.out.println("Повторите ввод: ");
                }
            }
        }
    }
}