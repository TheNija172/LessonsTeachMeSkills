package Lesson15;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    //-----Main-----
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            firstTask(scanner);
            secondTask();
            thirdTask();
            fourthTask();
        }
    }

    //-----Task 1-----
    public static void firstTask(Scanner scanner) {
        System.out.print("Enter numbers: ");
        LinkedHashSet<String> someNumbers = new LinkedHashSet<>(List.of(scanner.nextLine().split("\\D+")));
        System.out.println(someNumbers);
    }

    //-----Task 2-----
    public static void secondTask() {
        AnimalsNames animalsNames = new AnimalsNames("Cat", "Dog", "Bird");
        System.out.println(animalsNames);
        animalsNames.removeAnimalNameFromEnd();
        System.out.println(animalsNames);
        animalsNames.addAnimalNameToStart("Bird");
        System.out.println(animalsNames);
    }

    //-----Task 3-----
    public static void thirdTask() {
        Students students = new Students(
                new Student("Ivan", 224404, 3, 5.),
                new Student("Petr", 224401, 2, 2.2),
                new Student("Alex", 214402, 2, 4.1)
        );

        System.out.println("------All students-----------");
        System.out.println(students);

        System.out.println("-----Students of second course------");
        students.printStudents(2);
        System.out.println("--------Transferred students----------");
        students.transferStudents();
        System.out.println(students);
        System.out.println("----------------------------");
    }

    //-----Task 4-----
    public static void fourthTask() {
        MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(8);
        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains(2));
        arrayList.clear();
        System.out.println(arrayList);
    }
}
