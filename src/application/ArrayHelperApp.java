package application;

import application.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Dandi", "Irwanto", "Cimi"};
        Integer[] numbers = {1, 2, 3, 5, 6};

        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
