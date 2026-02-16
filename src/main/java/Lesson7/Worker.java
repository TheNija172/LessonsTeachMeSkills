package Lesson7;

public class Worker implements JobTitle{
    @Override
    public void printJobTitle() {
        System.out.println("Должность: рабочий");
    }
}
