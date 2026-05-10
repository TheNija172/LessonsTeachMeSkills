package Lesson30.prototype;

public class Archer implements Character{
    private String name;
    private int hpAmount;
    private int ammo;

    public Archer(String name, int hpAmount, int ammo) {
        this.name = name;
        this.hpAmount = hpAmount;
        this.ammo = ammo;
    }

    @Override
    public Character clone() {
        return new Archer(this.name, this.hpAmount, this.ammo);
    }

    @Override
    public void attack() {
        System.out.println("Archer attack");
    }

    @Override
    public void display() {
        System.out.println("Archer");
        System.out.println("Name: " + name);
        System.out.println("HP: " + hpAmount);
        System.out.println("Ammo: " + ammo);
    }
}
