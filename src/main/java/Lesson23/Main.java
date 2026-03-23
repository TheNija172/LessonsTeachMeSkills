package Lesson23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DomParser domParser = new DomParser();
        SaxParser saxParser = new SaxParser();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("---------------");
            System.out.println("1. DOM parser");
            System.out.println("2. SAX parser");
            System.out.println("---------------");

            switch (scanner.nextInt()) {
                case 1 -> domParser.parse();
                case 2 -> saxParser.parse();
                default -> System.out.println("Error");
            }

        } catch (Exception e) {
            System.out.println("Error!");
        }




        domParser.parse();
        saxParser.parse();
    }
}
