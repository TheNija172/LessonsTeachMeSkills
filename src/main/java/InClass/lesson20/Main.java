package InClass.lesson20;

/*
* Используя класс Thread создать поток Child который выводит числа от 1 до 100. В методе
main первой строкой вывести в консоль “Поток main начинает свою работу” затем создать
объект Child и запустить поток. Затем на последней строке метода main вывести в
консоль “Поток main завершает свою работу”. Посмотреть результат и сделать вывод
* */

/*
С помощью метода join() изменить предыдущий код таким образом, чтобы надпись “Поток
main завершает свою работу” всегда была последней
* */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Object object = new Object();
        Increaser increaser = new Increaser();

        Thread child1 = new Thread(new MyRunnable(new Counter(), object, new Increaser()));
        Thread child2 = new Thread(new MyRunnable(new Counter(), object, increaser));
        Thread child3 = new Thread(new MyRunnable(new Counter(), object, increaser));
        child3.setPriority(Thread.MAX_PRIORITY);


        child1.start();
        child2.start();
        child3.start();

    }
}
