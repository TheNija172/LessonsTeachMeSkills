package Lesson30.abstractFactory;

public class SmallBow implements Bow {
    @Override
    public void fire() {
        System.out.println("small bow");
    }
}
