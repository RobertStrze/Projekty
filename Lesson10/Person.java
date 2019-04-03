package Lesson10;

import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
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

    private Set<Person> family = new HashSet<>();

    List<Person> uniqueFam = new LinkedList<>();

    void addFamilyMember(Person member) {
        family.add(member);
    }

    void getFamilyMember() {
        uniqueFam.addAll(family);
        uniqueFam.sort(new AgeCompare());
    }
}