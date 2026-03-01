package InClass.lesson20;

public class Increaser {

    synchronized public void increase(Counter counter) {
        counter.setCount(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + counter.getCount());
            counter.increase();
        }
    }
}
