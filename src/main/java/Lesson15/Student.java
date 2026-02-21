package Lesson15;

/*
Поля: имя, группа, курс, средний балл.
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student {
    private String name;
    private Integer groupNumber;
    private Integer course;
    private Double gpa;

    @Override
    public String toString() {
        return "Name: " + name + "\tGroup: " + groupNumber + "\tCourse: " + course + "\tGPA: " + gpa + "\n";
    }
}
