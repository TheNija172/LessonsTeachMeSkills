package Lesson14;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    public static void firstTask() {

        try (FileReader fr = new FileReader("./src/main/java/Lesson14/SomeText.txt");
             FileWriter fw = new FileWriter("./src/main/java/Lesson14/MaxWord.txt");
             BufferedReader br = new BufferedReader(fr)
        ) {
            String maxWord = "";

            for (String line = br.readLine(); line != null; line = br.readLine()) {
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.length() > maxWord.length())
                        maxWord = word;
                }
            }

            fw.write(maxWord);
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void secondTask() {
        System.out.print("Enter path to file: ");
        String path;

        //   D:\Word\TeachMeSkills\LessonsTeachMeSkills\src\main\java\Lesson14\Documents.txt
        try (Scanner scanner = new Scanner(System.in)) {
            path = scanner.nextLine();
        }

        try (FileReader fr = new FileReader(path);
             FileWriter goodDocuments = new FileWriter("./src/main/java/Lesson14/GoodDocuments.txt");
             FileWriter badDocuments = new FileWriter("./src/main/java/Lesson14/BadDocuments.txt");
             BufferedReader br = new BufferedReader(fr)
        ) {
            String number;
            while ((number = br.readLine()) != null) {
                if (!number.matches("^[A-Za-z0-9]+$")) {
                    badDocuments.write(number + " (has bad symbols)\n");
                    continue;
                }
                if (!number.matches("^(contract|docnum).+")) {
                    badDocuments.write(number + " (doesn't contain contract/docnum)\n");
                    continue;
                }
                if (number.length() != 15) {
                    badDocuments.write(number + " (not 15 symbols length)\n");
                    continue;
                }
                goodDocuments.write(number + "\n");
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
