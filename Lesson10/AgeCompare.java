package Lesson10;

import java.util.Comparator;

class AgeCompare implements Comparator<Person> {
    public int compare(Person m1, Person m2) {
        if (m1.age == m2.age) {
            return 0;
        } else if (m1.age > m2.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
