package Lesson30.abstractFactory;

public class SmallWeaponFactory implements WeaponFactory {
    @Override
    public Sword createSword() {
        return new SmallSword();
    }

    @Override
    public Bow createBow() {
        return new SmallBow();
    }
}
