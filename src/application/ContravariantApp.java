package application;

import generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        // contravariant can subtitute super -> child class
        // can write but warning in read, otherwise is dangers
        // bisa dibilang ini kebalikan dari covariant
        MyData<Object> objectMyData = new MyData<>("Dandi");
        objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());

    }

    public static void process(MyData<? super String> myData) {

        // dangers
        //        Object value = myData.getData();
        //        System.out.println("Process parameter " + value);


        myData.setData("Cimi");
    }
}
