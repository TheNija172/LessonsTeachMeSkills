package Lesson30.prototype;

public class Mage implements Character {
    private String name;
    private int hpAmount;
    private int manaAmount;

    public Mage(String name, int hpAmount, int manaAmount) {
        this.name = name;
        this.hpAmount = hpAmount;
        this.manaAmount = manaAmount;
    }

    @Override
    public Character clone() {
        return new Mage(this.name, this.hpAmount, this.manaAmount);
    }

    @Override
    public void attack() {
        System.out.println("Mage attack");
    }

    @Override
    public void display() {
        System.out.println("Mage");
        System.out.println("Name: " + name);
        System.out.println("HP: " + hpAmount);
        System.out.println("Mana: " + manaAmount);
    }
}
