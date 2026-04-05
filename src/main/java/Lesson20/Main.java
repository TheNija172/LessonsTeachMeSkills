package Lesson20;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            firstTask(scanner);
            secondTask();
            thirdTask();
        }
    }

    public static void firstTask(Scanner scanner) {
        System.out.println("Enter array: ");
        try {
            List<Double> list = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Double::parseDouble)
                    .toList();
            MinFinder minFinder = new MinFinder(list);
            MaxFinder maxFinder = new MaxFinder(list);

            Thread thread1 = new Thread(minFinder);
            Thread thread2 = new Thread(maxFinder);

            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();

            System.out.println("Min element: " + minFinder.getMin());
            System.out.println("max element: " + maxFinder.getMax());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void secondTask() {
        try {
            List<Double> list = new ArrayList<>(List.of(
                    5.2, 1.1, 3.3, 2.0, 4.8
            ));

            InsertionSort insertionSort = new InsertionSort(list);
            SelectionSort selectionSort = new SelectionSort(list);
            BubbleSort bubbleSort = new BubbleSort(list);

            Thread insertionSortThread = new Thread(insertionSort);
            Thread selectionSortThread = new Thread(selectionSort);
            Thread bubbleSortThread = new Thread(bubbleSort);

            insertionSortThread.start();
            selectionSortThread.start();
            bubbleSortThread.start();

            insertionSortThread.join();
            selectionSortThread.join();
            bubbleSortThread.join();

            System.out.println(insertionSort);
            System.out.println(selectionSort);
            System.out.println(bubbleSort);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void thirdTask() {
        Shop shop = new Shop();
        Producer producer = new Producer(shop);
        Buyer buyer = new Buyer(shop);

        Thread producerThread = new Thread(producer);
        Thread buyerThread = new Thread(buyer);

        producerThread.start();
        buyerThread.start();
    }
}
