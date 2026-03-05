package Lesson18;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    //-----Task 1-----
    public static void firstTask() {
        List<Integer> numbersArray = new ArrayList<>(Arrays.asList(
                12, 7, 4, 12, 9, 18, 4, 21, 30, 18,
                5, 8, 16, 3, 8, 42, 11, 42, 2, 27
        ));

        int sum = numbersArray.stream()
                .distinct()
                .filter(integer -> integer % 2 == 0)
                .mapToInt(value -> value)
                .sum();

        System.out.println("-----------");
        System.out.println("Array list before editing: ");
        System.out.println(numbersArray);
        System.out.println("-----------");
        System.out.println("Array list after editing: " + sum);
    }

    //-----Task 2-----
    public static void secondTask() {
        Map<Integer, String> data = new HashMap<>();

        data.put(1, "Alex");
        data.put(2, "Maria"); //+
        data.put(3, "John");
        data.put(4, "Olga");
        data.put(5, "Michael"); //+
        data.put(6, "Eva");
        data.put(7, "Daniel");
        data.put(8, "Sofia"); //+
        data.put(9, "Max"); //+
        data.put(10, "Robert");
        data.put(11, "Anna");
        data.put(12, "Victor");
        data.put(13, "Leo"); //+
        data.put(14, "Diana");

        List<String> reversedNames = data.entrySet().stream()
                .filter(entry -> (entry.getKey() == 2 ||
                        entry.getKey() == 5 ||
                        entry.getKey() == 8 ||
                        entry.getKey() == 9 ||
                        entry.getKey() == 13)
                        && (entry.getValue().length() % 2 != 0))
                .map(Map.Entry::getValue)
                .map(name -> new StringBuilder(name).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(reversedNames);
    }
}
