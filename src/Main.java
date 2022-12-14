public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

        // Задание 1

        int[] arr = generateRandomArray();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task2() {

        // Задание 2

        int[] arr = generateRandomArray();

        int minSum = 200_000;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");

    }

    public static void task3() {

        // Задание 3

        int[] arr = generateRandomArray();

        double average;
        double sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum2 = sum2 + arr[i];
        }

        average = sum2 / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

    }

    public static void task4() {

        // Задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}