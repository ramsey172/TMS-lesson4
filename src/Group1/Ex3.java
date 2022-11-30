package Group1;

public class Ex3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 5, 7, 8, 8};
        int[] array2 = new int[]{2, 5, 7, 8, 9};
        double average1, average2;
        System.out.println("Массив 1:");
        printArray(array1);
        System.out.println("Массив 2:");
        printArray(array2);
        average1 = getArrayAverage(array1);
        average2 = getArrayAverage(array2);
        if (average1 > average2) {
            System.out.println("Среднее арифметическое элементов массива у первого больше");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое элементов массива у второго больше");
        } else {
            System.out.println("Средние арифметические элементов массива равны");
        }

    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public static double getArrayAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum * 1.0 / arr.length;
    }
}