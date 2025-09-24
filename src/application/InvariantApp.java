package application;

import generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Dandi"); // Define String di new bersifat optional
        // doIt(); -> error karena tidak bisa di turunkan ke child atau ke parent karena generic tidak support itu karena invariant

        // MyData<Object> objectMyData = stringMyData; -> tidak ada hubungan polymorphism/inheritance dengan generic

        MyData<Object> objectMyData = new MyData<>(1000);



    }

    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }
}
