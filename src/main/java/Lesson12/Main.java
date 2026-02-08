package Lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            firstTask(scanner);
            secondTask(scanner);
        }
    }

    public static void firstTask(Scanner scanner) {
        System.out.print("Enter line: ");
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }

    public static void secondTask(Scanner scanner) {
        //+(22)1234567fsfaw basa vadim.bagay@mail.ru 1234-1234-12

        System.out.print("Enter line: ");
        String line = scanner.nextLine();

        String documentNumber = "Not found";
        String phoneNumber = "Not found";
        String email = "Not found";

        //xxxx-xxxx-xx
        Pattern documentNumberPatter = Pattern.compile("(\\d{4}-){2}\\d{2}");

        //+(xx)xxxxxxx
        Pattern phoneNumberPattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");

        //email
        Pattern emailPattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z]+\\.[A-Za-z]{2,6}");

        Matcher matcher = documentNumberPatter.matcher(line);
        if(matcher.find())
            documentNumber = matcher.group();


        matcher = phoneNumberPattern.matcher(line);
        if(matcher.find())
            phoneNumber = matcher.group();

        matcher = emailPattern.matcher(line);
        if (matcher.find())
            email = matcher.group();

        System.out.println("Email: " + email);
        System.out.println("Document: " + documentNumber);
        System.out.println("Phone: " + phoneNumber);
    }
}
