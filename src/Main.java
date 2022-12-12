import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        // Задание 1

        int [] weight = new int [3];

        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;

        double [] weight2 = {1.57, 7.654, 9.986};

        int [] weight3 = {20, 40, 60};

        // Задание 2

        for (int i = 0 ; i < weight.length ; i++ ) {
            System.out.print(weight[i]);

            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0 ; i < weight2.length ; i++ ) {
            System.out.print(weight2[i]);

            if (i != weight2.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0 ; i < weight3.length ; i++ ) {
            System.out.print(weight3[i]);

            if (i != weight3.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // Задание 3

        for (int i = weight.length - 1 ; i >= 0 ; i-- ) {
            System.out.print(weight[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = weight2.length - 1 ; i >= 0 ; i-- ) {
            System.out.print(weight2[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = weight3.length - 1 ; i >= 0 ; i-- ) {
            System.out.print(weight3[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // Задание 4

        for (int i = 0 ; i < weight.length ; i++ ) {

            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1;
            }
        }

        System.out.println(Arrays.toString(weight));

    }
}