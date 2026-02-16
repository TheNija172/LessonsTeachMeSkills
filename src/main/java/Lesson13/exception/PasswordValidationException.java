package Lesson13.exception;

public class PasswordValidationException extends Exception {

    public PasswordValidationException() {
    }

    public PasswordValidationException(String message) {
        super(message);
    }
}
