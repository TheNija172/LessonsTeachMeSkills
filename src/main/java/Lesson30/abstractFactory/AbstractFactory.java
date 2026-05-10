package Lesson30.abstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new SmallWeaponFactory();
        Bow bow = weaponFactory.createBow();
        Sword sword = weaponFactory.createSword();

        bow.fire();
        sword.attack();
    }
}
