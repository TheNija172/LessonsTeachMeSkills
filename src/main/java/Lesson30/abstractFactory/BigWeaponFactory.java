package Lesson30.abstractFactory;

public class BigWeaponFactory implements WeaponFactory {
    @Override
    public Sword createSword() {
        return new BigSword();
    }

    @Override
    public Bow createBow() {
        return new BigBow();
    }
}
