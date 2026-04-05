package Lesson20;

import lombok.Getter;

import java.util.List;

@Getter
public class InsertionSort implements Runnable{
    private List<Double> list;
    private long time;

    public InsertionSort(List<Double> list) {
        this.list = list;
    }

    @Override
    public void run() {
        long start = System.nanoTime();
        for (int i = 1; i < list.size(); i++) {
            double key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);
        }

        long end = System.nanoTime();
        time = end - start;
    }

    @Override
    public String toString() {
        return "Insertion Sort| \t time:" + time + " array: " + list;
    }
}
