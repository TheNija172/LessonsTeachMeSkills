package Lesson8;

public class Apple {
    private String  color = null;

    public class FruitColor
    {
        public void setFruitColor(String color) {
            Apple.this.color = color;
        }
    }

    public void printColor() {
        System.out.println(color);
    }
}
