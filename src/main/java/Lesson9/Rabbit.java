package Lesson9;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Фи-фи");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("grass")) {
            System.out.println("Нравится");
        } else {
            System.out.println("Недоволен");
        }
    }
}
