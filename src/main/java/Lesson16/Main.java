package Lesson16;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }

    //-----Task 1-----
    public static void firstTask() {
        String[] array = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> wordMultiple = new HashMap<>();

        for (String word : array) {
            wordMultiple.replace(word, true);
            wordMultiple.putIfAbsent(word, false);
        }

        System.out.println(wordMultiple);
    }

    //-----Task 2-----
    public static void secondTask() {
        String[] array = {"man", "moon", "good", "night"};
        Map<Character, Character> pairs = new HashMap<>();

        for (String word : array) {
            pairs.put(word.charAt(0), word.charAt(word.length() - 1));
        }

        System.out.println(pairs);
    }

    //-----Task 3-----
    public static void thirdTask() {
        String line1 = "function test() { if (a[0] > b[1]) return arr[(2 + 3)]; }";
        String line2 = "if (a[2 > b[3]) { return (x + y); }";

        System.out.println("First line: " + BalancedLine.isBalanced(line1));
        System.out.println("Second line: " + BalancedLine.isBalanced(line2));
    }

}
