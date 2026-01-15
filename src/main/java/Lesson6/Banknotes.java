package Lesson6;

public enum Banknotes {

    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    private final int value;

    private Banknotes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
