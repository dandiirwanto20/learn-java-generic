package generic;

public class MyData<T> {
    // jangan ambigu ketika define generic char
    private T data;

    public MyData(T data) {
        this.data = data;
    }

    // covariant just can handle readonly data or get data, cant set new data or edit in generic
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
