package Kunal_Kushwaha.Generics;

import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i <data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(int num) {
        return data[size--];
    }

    public int getData(int index) {
        return data[index];
    }

    public void setData(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomArrayList{");
        sb.append("data=");
        if (data == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < data.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(data[i]);
            sb.append(']');
        }
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(45);
        l.add(46);
        l.remove(0);


        CustomArrayList list = new CustomArrayList();
        list.add(55);
        list.add(79);
        list.add(12);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list);
    }
}
