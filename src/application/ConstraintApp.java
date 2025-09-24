package application;


// implement bound type parameter in generic
public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(2L);

        // paksa
        // NumberData<String> stringNumberData = new NumberData<>("Dan"); -> error karena bukan turunan dari class number
    }

    public static class NumberData<T extends Number> {
        // keuntungan dapat mengakses method yang ada di Number daripada menggunakan Object yang notabennya hanya bisa akses di Object
        // case untuk kebutuhan tertentu
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
