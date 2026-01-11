package Lesson4;

import java.util.Arrays;
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
                System.out.println("2. Задание 2 и 3");
                System.out.println("3. Задание 4");
                System.out.println("4. Задание 5");
                System.out.println("5. Задание 6");
                System.out.println("6. Задание *");


                while (!scanner.hasNextInt()) {
                    System.out.println("Неверный ввод данных");
                    scanner.next();
                }

                menu = scanner.nextInt();

                switch (menu) {
                    case 0 -> {return;}
                    case 1 -> FirstTask(array);
                    case 2 -> SecondAndThirdTask(array);
                    case 3 -> FourthTask(array);
                    case 4 -> FifthTask(array);
                    case 5 -> SixthTask(array);
                    case 6 -> SeventhTask(array);
                    default -> {}
                }
            }
        }
    }


    //-----Task 1-----
    public static void FirstTask(int[] array) {

        System.out.print("В прямом порядке: [ ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("]");
        System.out.print("В обратном порядке: [ ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    //-----Task 2+3-----
    public static void SecondAndThirdTask(int[] array) {
        int maxElement = array[0];
        int minElement = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                maxIndex = i;
            }
            if (minIndex > array[i]) {
                minElement = array[i];
                minIndex = i;
            }
        }

        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Максимальный индекс: " + maxIndex);
        System.out.println("Минимальный элемент: " + minElement);
        System.out.println("Минимальный индекс: " + minIndex);
    }


    //-----Task 4-----
    public static void FourthTask(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element == 0)
                counter++;
        }
        if (counter > 0)
            System.out.println("Нулевых элементов: " + counter);
        else
            System.out.println("Нулевых элементов нет");
    }


    //-----Task 5-----
    public static void FifthTask(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }


    //-----Task 6-----
    public static void SixthTask(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1])
                continue;
            else {
                System.out.println("Массив не возрастающий");
                return;
            }
        }
        System.out.println("Массив возрастающий");
    }


    //-----Task 7-----
    public static void SeventhTask(int[] array) {
        array[array.length-1] += 1;
        if(array.length == 1) return;
        for(int i= array.length-1; i >= 0; i--)
        {
            if (array[i] < 10)
                break;
            else if (i > 0 )
            {
                array[i] = 0;
                array[i - 1] += 1;
            }
            else
            {
                int[] tempArray = new int[array.length + 1];
                tempArray[0] = 1;
                System.out.println(Arrays.toString(tempArray));
                return;
            }
        }
        System.out.println(Arrays.toString(array));
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
                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Введите " + (i + 1) + " элемент: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Повторите ввод: ");
                            scanner.next();
                        }
                        array[i] = scanner.nextInt();
                    }
                    return array;
                }
                case 2 -> {
                    for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextInt(0, 50);
                    }
                    return array;
                }
                default -> System.out.println("Повторите ввод: ");

            }
        }
    }
}