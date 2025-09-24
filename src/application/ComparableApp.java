package application;

import generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Dandi", "Rembang"),
            new Person("Cimi", "Rembang"),
            new Person("Sushi", "Rembang")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));


    }
}
