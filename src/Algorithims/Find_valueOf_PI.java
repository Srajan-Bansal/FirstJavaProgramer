package Algorithims;

import java.util.Random;

public class Find_valueOf_PI {
    public static void main(String[] args) {
        System.out.println(valueOfPI(1000));
    }

    static double valueOfPI(int n) {
        Random generator = new Random();

        int num_point_circle = 0;
        int num_point_total = 0;

        for (int i = 0; i < n; i++) {
            double x = generator.nextDouble();
            double y = generator.nextDouble();

            double distance = x*x + y*y;
            if (distance <= 1) {
                num_point_circle++;
            }
            num_point_total++;
        }
        return 4.0 * num_point_circle / num_point_total;
    }
}

