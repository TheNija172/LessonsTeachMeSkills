package Lesson20;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.sql.SQLOutput;

@Setter
@AllArgsConstructor
public class Producer implements Runnable {
    private final Shop shop;

    @Override
    public void run() {
        synchronized (shop) {
            try {
                for (int i = 0; i < 5; i++) {
                    if (shop.getAmount().get() >= 3) {
                        shop.notifyAll();
                        shop.wait();
                    }
                    shop.addItem();
                    System.out.println("Произвёл " + (i + 1) + " товар");
                }
                shop.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
