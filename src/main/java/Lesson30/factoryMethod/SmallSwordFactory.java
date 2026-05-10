package Lesson30.factoryMethod;

public class SmallSwordFactory implements SwordFactory{
    @Override
    public Sword createSword() {
        return new SmallSword();
    }
}
