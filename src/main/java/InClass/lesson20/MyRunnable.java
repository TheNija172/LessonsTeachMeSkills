package InClass.lesson20;

/*
Создать класс Counter с полем count и методом increase() который увеличивает count на
1. Создать второй класс CounterThread с интерфейсом Runnable, полем Counter и
конструктором, который инициализирует поле Counter. Метод run() должен иметь
следующую логику
* */

public class MyRunnable implements Runnable {

    Counter counter;
    final Object obj;
    Increaser increaser;

    public MyRunnable(Counter counter, Object object, Increaser increaser) {
        this.counter = counter;
        this.obj = object;
        this.increaser = increaser;
    }

    @Override
    public void run() {
        increaser.increase(counter);
    }


}
