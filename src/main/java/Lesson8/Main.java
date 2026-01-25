package Lesson8;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        System.out.println("----------------------");
    }

    //--------Task 1-----------
    public static void firstTask() {
        Patient patient = new Patient();
        Therapist therapist = new Therapist();

        System.out.println("----------------------");
        patient.setTreatmentPlan(1);
        therapist.prescribeTreatment(patient);
        patient.printDoctor();

        patient.setTreatmentPlan(2);
        therapist.prescribeTreatment(patient);
        patient.printDoctor();

        patient.setTreatmentPlan(3);
        therapist.prescribeTreatment(patient);
        patient.printDoctor();
    }

    //--------Task 2------------
    public static void secondTask() {
        Apple apple = new Apple();
        Apple.FruitColor appleColor = apple.new FruitColor();

        System.out.println("----------------------");
        appleColor.setFruitColor("red");
        apple.printColor();
        appleColor.setFruitColor("green");
        apple.printColor();
    }
}
