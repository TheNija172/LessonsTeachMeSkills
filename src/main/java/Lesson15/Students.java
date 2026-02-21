package Lesson15;

/*
Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе
*/

import java.util.ArrayList;
import java.util.List;

public class Students {
    private ArrayList<Student> students = new ArrayList<>();

    public Students(Student... students) {
        this.students.addAll(List.of(students));
    }

    public void transferStudents() {
        students.removeIf(student -> student.getGpa() < 3);

        for (Student student: students) {
                student.setCourse(student.getCourse()+1);
        }
    }

    public void printStudents(int course) {
        students.forEach(student -> {if(student.getCourse() == course) System.out.print(student);});
    }

    @Override
    public String toString() {
        return students.toString();
    }
}
