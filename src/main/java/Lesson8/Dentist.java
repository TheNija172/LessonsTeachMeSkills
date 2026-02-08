package Lesson8;

public class Dentist extends Doctor{
    @Override
    public String treat() {
        return super.treat() + "дантист";
    }
}
