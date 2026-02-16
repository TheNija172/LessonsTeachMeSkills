package Lesson8;

public class Patient {
    private Doctor doctor;
    private int treatmentPlan;

    public Patient() {
        doctor = null;
        treatmentPlan = 0;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void printDoctor() {
        System.out.println(doctor.treat());
    }
}
