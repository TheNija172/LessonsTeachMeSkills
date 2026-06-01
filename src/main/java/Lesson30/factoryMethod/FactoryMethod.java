package Lesson30.factoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        SwordFactory swordFactory = new BigSwordFactory();
        Sword sword = swordFactory.createSword();
        sword.attack();
    }
}
