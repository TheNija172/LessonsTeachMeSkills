package Lesson8;

public class Therapist extends Doctor{

    public void prescribeTreatment(Patient patient)
    {
        switch (patient.getTreatmentPlan())
        {
            case 1 -> patient.setDoctor(new Surgeon());
            case 2 -> patient.setDoctor(new Dentist());
            default -> patient.setDoctor(this);
        }
    }

    @Override
    public String treat() {
        return super.treat() + "терапевт";
    }
}
