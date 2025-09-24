package application;

import generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String>  stringMyData = new MyData<>("Dandi");
        process(stringMyData);

        // define second covariant example
        MyData<? extends Object> myData = stringMyData;
    }

    // define covariant example
    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

    }
}
