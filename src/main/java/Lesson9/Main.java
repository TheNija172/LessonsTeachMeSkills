package Lesson9;

public class Main {
    public static void main(String[] args) {
        firstAndSecondTask();
    }

    //------Task 1 and 2------
    public static void firstAndSecondTask() {
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();

        //Собака
        System.out.println("--------------");
        System.out.print("Собака говорит: ");
        Dog.getInstance().voice();
        System.out.println("Кушает мясо/траву:");
        Dog.getInstance().eat("Meat");
        Dog.getInstance().eat("Grass");

        //Тигр
        System.out.println("--------------");
        System.out.print("Тигр говорит: ");
        tiger.voice();
        System.out.println("Кушает мясо/траву:");
        tiger.eat("Meat");
        tiger.eat("Grass");

        //Кролик
        System.out.println("--------------");
        System.out.print("Кролик говорит: ");
        rabbit.voice();
        System.out.println("Кушает мясо/траву:");
        rabbit.eat("Meat");
        rabbit.eat("Grass");
        System.out.println("--------------");
    }
}
