package Lesson9;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Р-р-р-р");
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
