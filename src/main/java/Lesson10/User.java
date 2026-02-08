package Lesson10;

import java.util.Objects;

public class User implements Cloneable {
    String firstName;
    String lastName;
    int age;
    Pet pet;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pet = new Pet(null);
    }

    public User(String firstName, String lastName, int age, String petName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pet = new Pet(petName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof User other))
            return false;
        return age == other.age &&
                Objects.equals(firstName, other.firstName) &&
                Objects.equals(lastName, other.lastName);
    }

    @Override
    public String toString() {
        return "First name: " + firstName + "\nLast name: " + lastName + "\nAge: " + age + "\nPet class: " + pet;
    }



    @Override
    public User clone() throws CloneNotSupportedException {
            return (User) super.clone();
    }

    public User deepClone() throws CloneNotSupportedException {
        User newUser = this.clone();
        newUser.pet = pet.clone();
        return newUser;
    }
}
