package Lesson20;

import lombok.Getter;

import java.util.List;

@Getter
public class MaxFinder implements Runnable {
    List<Double> arrayList;
    double max;

    public MaxFinder(List<Double> arrayList) {
        this.arrayList = arrayList;
        max = arrayList.get(0);
    }

    @Override
    public void run() {
        max = arrayList.stream().max(Double::compare).orElse(Double.NaN);
    }
}
