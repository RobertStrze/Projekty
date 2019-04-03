package Lesson10;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Person member1 = new Person("John", "Smith", 45);
        Person member2 = new Person("Alice", "Smith", 43);
        Person member3 = new Person("Joshua", "Smith", 20);
        Person member4 = new Person("John", "Doe", 34);

        List<Person> people = new LinkedList<>();
        people.add(member1);
        people.add(member2);
        people.add(member3);
        people.add(member4);

        for (Person one : people) {
            for (Person two : people) {
                if (one.equals(two)) {
                    continue;
                }
                if (one.surname.equals(two.surname)) {
                    one.addFamilyMember(two);
                }
            }
        }
        System.out.println("People " + people);
        for(Person member: people){
            System.out.println(member.name + " " + member.getFamilyMember());
        }

    }
}
