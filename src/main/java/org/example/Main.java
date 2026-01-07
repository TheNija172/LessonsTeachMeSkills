package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Выберите действие: ");
                System.out.println("0. Выход");
                System.out.println("1. Задание 1");
                System.out.println("2. Задание 2");
                System.out.println("3. Задание 3");
                System.out.println("4. Задание 4");
                System.out.println("5. Задание 5");

                menu = scanner.nextInt();
                while (!scanner.hasNextInt())
                {
                    System.out.println("Неверный ввод данных");
                    scanner.next();
                }

                switch (menu) {
                    case 0 -> {
                        return;
                    }
                    case 1 -> {
                        //ggg
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


}