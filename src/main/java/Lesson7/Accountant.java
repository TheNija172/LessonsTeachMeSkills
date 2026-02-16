package Lesson7;

public class Accountant implements JobTitle{
    @Override
    public void printJobTitle() {
        System.out.println("Должность: бухгалтер");
    }
}
