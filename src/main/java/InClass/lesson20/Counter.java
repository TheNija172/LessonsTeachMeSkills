package InClass.lesson20;

/*
Создать класс Counter с полем count и методом increase() который увеличивает count на
1. Создать второй класс CounterThread с интерфейсом Runnable, полем Counter и
конструктором, который инициализирует поле Counter. Метод run() должен иметь
следующую логику
* */

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Counter {
    private Integer count;

    public Counter() {
        count = 0;
    }

    public void increase() {
        count++;
    }
}
