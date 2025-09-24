package application;

import generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        // define object generic in java
        MyData<String> stringMyData = new MyData<String>("Dandi");
        MyData<Integer> integerMyData = new MyData<Integer>(20);

        stringMyData.getData();
        integerMyData.getData();

        // define field/value
        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();
        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
