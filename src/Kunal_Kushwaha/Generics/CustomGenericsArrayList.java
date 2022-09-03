package Kunal_Kushwaha.Generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i <data.length; i++) {
            temp[i] = (T)data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(T num) {
        T removed = (T)data[--size];
        return removed;
    }

    public T getData(int index) {
        return (T)data[index];
    }

    public void setData(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CustomGenericsArrayList{");
        sb.append("data=").append(data == null ? "null" : Arrays.asList(data).toString());
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
    }
}
