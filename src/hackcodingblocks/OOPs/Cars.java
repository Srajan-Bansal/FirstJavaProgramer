package hackcodingblocks.OOPs;

import java.util.*;

public class Cars implements Comparable<Cars> {
    int price;
    int speed;
    String color;

    public Cars() {
    }

    public Cars(int price, int speed, String color) {
        this.price = price;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "price=" + price +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }

    static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }

    public static void main(String[] args) {
        Cars[] cars = new Cars[5];

        cars[0] = new Cars(143423, 762, "Black");
        cars[1] = new Cars(421, 5242, "White");
        cars[2] = new Cars(1432, 522, "Yellow");
        cars[3] = new Cars(3241, 252, "Green");
        cars[4] = new Cars(14234, 25235, "Blue");

        Arrays.sort(cars, (o1, o2) -> o1.price - o2.price);
//        sort(cars);

        for (Cars car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public int compareTo(Cars o) {
        return this.price - o.price;
    }
}
