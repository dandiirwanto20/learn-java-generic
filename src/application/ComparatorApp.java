package application;

import generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Dandi", "Rembang"),
                new Person("Cimi", "Rembang"),
                new Person("Sushi", "Rembang")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        // mengurutkan
        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
