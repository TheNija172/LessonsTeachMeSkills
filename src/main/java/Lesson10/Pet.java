package Lesson10;

public class Pet implements Cloneable{
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    protected Pet clone() throws CloneNotSupportedException {
        return (Pet) super.clone();
    }
}
