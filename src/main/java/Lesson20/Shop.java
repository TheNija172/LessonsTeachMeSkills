package Lesson20;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
public class Shop{
    private final AtomicInteger amount = new AtomicInteger(0);

    public void addItem() {
        amount.incrementAndGet();
    }

    public void buyItem() {
        amount.decrementAndGet();
    }
}
