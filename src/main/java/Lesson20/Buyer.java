package Lesson20;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Buyer implements Runnable {
    private final Shop shop;


    @Override
    public void run() {
        synchronized (shop) {
            try {
                for (int i = 0; i < 5; i++) {
                    if (shop.getAmount().get() <= 0) {
                        shop.notifyAll();
                        shop.wait();
                    }
                    shop.buyItem();
                    System.out.println("Купил " + (i + 1) + " товар");
                }
            shop.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
