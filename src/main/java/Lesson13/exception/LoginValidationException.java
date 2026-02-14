package Lesson13.exception;

public class LoginValidationException extends Exception {

    public LoginValidationException() {
    }

    public LoginValidationException(String message) {
        super(message);
    }
}
