package Lesson9;

public class Dog extends Animal {
    private static Dog INSTANCE;

    private Dog() {
    }

    public static Dog getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Dog();

        return INSTANCE;
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("meat")) {
            System.out.println("Нравится");
        } else {
            System.out.println("Недоволен");
        }
    }
}
