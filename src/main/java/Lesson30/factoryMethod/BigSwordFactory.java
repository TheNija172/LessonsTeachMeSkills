package Lesson30.factoryMethod;

public class BigSwordFactory implements SwordFactory{
    @Override
    public Sword createSword() {
        return new BigSword();
    }
}
