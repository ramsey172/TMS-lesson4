import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        arrayFill(array);
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Массив с заменой значений нечетных индексов на 0: " + Arrays.toString(replaceOddIndexValueToZero(array)));

    }

    public static void arrayFill(int[] arr) {
        for (int n = 0; n < arr.length; n++) {
            arr[n] = (int) (Math.random() * 10);
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int[] replaceOddIndexValueToZero(int[] arr) {
        for (int n = 0; n < arr.length; n++) {
            if (!isEven(n)) {
                arr[n] = 0;
            }
        }
        return arr;
    }
}