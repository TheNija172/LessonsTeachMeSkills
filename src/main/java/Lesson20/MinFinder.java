package Lesson20;

import lombok.Getter;

import java.util.List;

@Getter
public class MinFinder implements Runnable {
    List<Double> arrayList;
    double min;

    public MinFinder(List<Double> arrayList) {
        this.arrayList = arrayList;
        min = arrayList.get(0);
    }

    @Override
    public void run() {
        min = arrayList.stream().min(Double::compare).orElse(Double.NaN);
    }
}
