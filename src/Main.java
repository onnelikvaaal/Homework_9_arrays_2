public class Main {
    public static void main(String[] args) {
        int[] numbers = generateRandomArray();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("Задача 1");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];//+=
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        System.out.println("Задача 2");
        int maxNumber = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxNumber + " рублей");
        System.out.println();

        int minNumber = 200_001;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minNumber + " рублей");
        System.out.println();
        System.out.println("Задача 3");
        double averageNumber = 0;
        double sumDouble = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumDouble = sumDouble + numbers[i];
        }
        averageNumber = sumDouble / numbers.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageNumber + " рублей");

        //второй вариант решения, Коля подсказал про приведение типов
        double averageNumber1 = (double) sum / numbers.length;
        System.out.println(averageNumber1);
        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}