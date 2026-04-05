package Lesson20;

import lombok.Getter;

import java.util.List;

@Getter
public class SelectionSort implements Runnable {
    private List<Double> list;
    private long time;

    public SelectionSort(List<Double> list) {
        this.list = list;
    }

    @Override
    public void run() {
        long start = System.nanoTime();
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            double temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }

        long end = System.nanoTime();
        time = end - start;
    }

    @Override
    public String toString() {
        return "Selection Sort| \t time:" + time + " array: " + list;
    }
}
