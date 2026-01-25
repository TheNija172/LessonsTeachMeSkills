package Lesson8;

public class Surgeon extends Doctor{
    @Override
    public String treat() {
        return super.treat() + "хирург";
    }
}
