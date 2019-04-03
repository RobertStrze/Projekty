package Lesson10;

import java.util.*;

public class Person implements Comparable<Person> {
    String name;
    String surname;
    int age;

    @Override
    public String toString() {
        return "{" +
                name  +
                " " +surname +
                ", " + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.surname.compareTo(person.surname);
    }

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Set<Person> family = new HashSet<>();

    void addFamilyMember(Person member) {
        family.add(member);
    }

    List<Person> getFamilyMember() {
        List<Person> uniqueFam = new LinkedList<>();
        uniqueFam.addAll(family);
        uniqueFam.sort(new AgeCompare());
        return uniqueFam;
    }
}