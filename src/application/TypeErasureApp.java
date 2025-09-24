package application;

import generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
         MyData<String> myData = new MyData<>("Dandi");

        // Type Erasure ketika dicompile aman tapi ketika dijalankan akan error jadi akan jadi berbahaya kalo tidak ada info generic
        // MyData myData = new MyData<>("Dandi"); // contoh Type Erasure tanpa info generic

//        MyData<Integer> integerMyData = (MyData<Integer>) myData; // kalo ini di define dengan type erasure maka tidak ada error
//        Integer integer = integerMyData.getData();


    }
}
