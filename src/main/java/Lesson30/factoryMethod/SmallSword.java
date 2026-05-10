package Lesson30.factoryMethod;

public class SmallSword implements Sword{
    @Override
    public void attack() {
        System.out.println("Small sword");
    }
}
