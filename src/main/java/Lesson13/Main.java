package Lesson13;

import Lesson13.exception.LoginValidationException;
import Lesson13.exception.PasswordValidationException;

public class Main {
    public static void main(String[] args) throws PasswordValidationException, LoginValidationException {
        firstTask();
        secondTask();
    }

    public static void firstTask() throws PasswordValidationException, LoginValidationException {
        System.out.println(User.validation("test", "test123", "test123"));
    }

    public static void secondTask() {
        try {
            System.out.println("Try");
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }
    }
}
