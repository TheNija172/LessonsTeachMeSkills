package Lesson30.abstractFactory;

public class SmallSword implements Sword {
    @Override
    public void attack() {
        System.out.println("small sword");
    }
}
