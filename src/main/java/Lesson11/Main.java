package Lesson11;

import java.util.Scanner;

public class Main {
    //--------Main-------------
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            firstTask(scanner);
            secondTask(scanner);
        }
    }

    //------First task--------
    public static void firstTask(Scanner scanner) {
        System.out.println("Enter lines 1, 2 и 3: ");
        LinesChanger linesChanger = new LinesChanger(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println("------------");
        System.out.println(linesChanger);
        System.out.println("------------");
        linesChanger.printShortAndLongLine();
        System.out.println("------------");
        linesChanger.sortLinesForLength();
        System.out.println(linesChanger);
        System.out.println("------------");
        linesChanger.printLinesLessThenAverage();
        System.out.println("------------");
        System.out.println(linesChanger.findLineWithDifferentSymbols());
        System.out.println("------------");
        linesChanger.printLineWithCloneSymbols(1);
        System.out.println("------------");
    }

    //--------Second task-----------
    public static void secondTask(Scanner scanner) {
        System.out.print("Enter line: ");
        String line = scanner.nextLine();
        System.out.print("Enter word number: ");
        while (!scanner.hasNextInt())
        {
            System.out.print("Try again: ");
            scanner.next();
        }

        System.out.println("Is palindrome: " + PalindromeChecker.isPalindrome(line, scanner.nextInt()));
    }

}
