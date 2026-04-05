package Lesson20;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
public class BubbleSort implements Runnable {
    private List<Double> list;
    private long time;

    public BubbleSort(List<Double> list) {
        this.list = list;
    }

    @Override
    public void run() {
        long start = System.nanoTime();
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    double temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
        long end = System.nanoTime();
        time = end - start;
    }

    @Override
    public String toString() {
        return "Bubble Sort| \t time:" + time + " array: " + list;
    }
}
