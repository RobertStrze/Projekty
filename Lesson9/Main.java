package Lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John", 21);
        Person person2 = new Person("Robert", 20);
        Person person3 = new Person("John", 23);
        Person person4 = new Person("Felix", 26);
        Person person5 = new Person("David", 27);

        Person[] persons = {person1, person2, person3, person4, person5};

        List<Person> employees = new LinkedList<>();//List can store duplicates and that's why it have three Johns (two (John,21) and one (John,23))

        for (Person employee : persons) {
            if (employee == person1) {
                employees.add(employee);
                employees.add(employee);
            } else {
                employees.add(employee);
            }
        }

       Set<Person> uniqueEmployees = new HashSet<>(employees);// In this case Set have two Johns because they are different objects (John,21) and (John,23) but in Employees List was three Johns so that proves that Set do not store objects with the same reference

        Map<String,Integer> nameToPerson  = new HashMap<>();// Map do not have the same size as Set because Map do not store duplicated keys, that's why map have only one John
        for (int i = 0; i < employees.size(); i++) {
            Person empl = employees.get(i);
            nameToPerson.put(empl.getName(),empl.getAge() );
        }
        System.out.println("List: " +employees);
        System.out.println("Set: " + uniqueEmployees);
        System.out.println("Map: " + nameToPerson);
    }
}
