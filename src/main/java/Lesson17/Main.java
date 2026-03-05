package Lesson17;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            firstTask(scanner);
            secondTask();
            thirdTask();
            fourthTask();
            fifthTask(scanner);
        }
    }

    //-----Task 1-----
    public static void firstTask(Scanner scanner) {
        System.out.print("Enter your birthday (yyyy-mm-dd): ");
        try {
            LocalDate hundredYears = LocalDate.parse(scanner.nextLine()).plusYears(100);
            System.out.println("Hundred date: " + hundredYears);
        } catch (DateTimeParseException e) {
            System.out.println("Wrong date");
        }
    }

    //-----Task 2-----
    public static void secondTask() {
        Double[] array = {1., 2., 3., 4., -9., -95., 15., -6.};
        Predicate<Double> isPositive = number -> number >= 0;

        for (Double number : array) {
            if (isPositive.test(number))
                System.out.print(number + " ");
        }
        System.out.println();
    }

    //-----Task 3-----
    public static void thirdTask() {
        String balance = "600 BYN";

        ConverterToUSD converterToUSD = (money) -> {
            double value = Double.parseDouble(money.replaceAll("\\D.", ""));
            return value / 3 + " USD";
        };

        System.out.println(converterToUSD.convert(balance));
    }

    //-----Task 4-----
    public static void fourthTask() {
        String balance = "9000 BYN";

        Consumer<String> converter = money -> {
            double value = Double.parseDouble(money.replaceAll("\\D.", ""));
            System.out.println(value / 3 + " USD");
        };

        converter.accept(balance);
    }

    //-----Task 5-----
    public static void fifthTask(Scanner scanner) {
        Supplier<StringBuffer> reverser = () -> {
            StringBuffer line = new StringBuffer(scanner.nextLine());
            return line.reverse();
        };

        System.out.print("Enter your line: ");
        System.out.println(reverser.get());
    }
}
