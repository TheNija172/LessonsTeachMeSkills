package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Выберите действие:");
                System.out.println("0. Выход");
                System.out.println("1. Задание 1");
                System.out.println("2. Задание 2");
                System.out.println("3. Задание 3");
                switch (CheckInt(sc)) {
                    case 0 -> {
                        return;
                    }
                    case 1 -> fistTask(sc);
                    case 2 -> secondTask();
                    case 3 -> thirdTask(sc);
                    default -> System.out.println("Данного действия нет");
                }
            }
        }
    }

    //-----Task 1-----
    public static void fistTask(Scanner sc) {
        Random random = new Random();
        int height, width, number;
        int sum = 0;

        System.out.println("Введите  размер матрицы");

        do {
            System.out.print("Количество строк: ");
            height = CheckInt(sc);
        } while (height < 0);

        do {
            System.out.print("Количество столбцов: ");
            width = CheckInt(sc);
        } while (width < 0);


        System.out.println("Ваша матрица: ");
        int[][] matrix = new int[height][width];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 50);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Введите число для прибавления: ");
        number = CheckInt(sc);
        System.out.println("Новая матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += number;
                System.out.print(matrix[i][j] + "\t");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Сумма чисел матрицы: " + sum);
    }

    //-----Task 2-----
    public static void secondTask() {
        String[][] matrix = new String[8][8];

        System.out.println("Шахматная доска: ");

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j % 2 == 0)
                        matrix[i][j] = "W";
                    else
                        matrix[i][j] = "B";
                    System.out.print(matrix[i][j] + "\t");

                }
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j % 2 == 0)
                        matrix[i][j] = "B";
                    else
                        matrix[i][j] = "W";
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }

    //-----Task 3-----
    public static void thirdTask(Scanner sc) {
        int height, width;
        int counter = 1;
        System.out.println("Введите  размер матрицы");

        do {
            System.out.print("Количество строк: ");
            height = CheckInt(sc);
        } while (height < 0);

        do {
            System.out.print("Количество столбцов: ");
            width = CheckInt(sc);
        } while (width < 0);

        int[][] matrix = new int[height][width];

        for (int i = 0; i < matrix.length; i++) {
            if (i%2==0)
            {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = counter++;
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            else {
                for (int j = matrix[i].length-1; j >= 0 ; j--) {
                    matrix[i][j] = counter ++;
                }
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }

    //Checking for input int
    public static int CheckInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Повторите ввод: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
