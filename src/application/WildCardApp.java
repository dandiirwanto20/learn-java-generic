package application;

import generic.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        printLength(new MyData<>(100));
        printLength(new MyData<>("Dandi"));
        printLength(new MyData<>(true));

        printLength(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void printLength(MyData<?> myData) {
        /* Note if use wildcard generic <?>:
        Jangan sekali kali menggunakan set data di wildcard, karena bahaya
        karena kita tidak tau type apa yang ada di wildcard jadi hanya bisa menggunakan get/read
         */
        // Object o = data.getData();
        System.out.println(myData.getData());
    }
}
