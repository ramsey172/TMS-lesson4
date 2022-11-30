import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int arrayLength = scanner.nextInt();

        while(!isValid(arrayLength)){
            System.out.println("Неверное число. Нужно больше пяти и меньше 11. Повторите ввод:");
            arrayLength = scanner.nextInt();
        }
        int[] array = new int[arrayLength];
        arrayFill(array);
        System.out.println("Массив: "+ Arrays.toString(array));
        int evenEntries = evenEntriesCount(array);
        if(evenEntries == 0){
            System.out.println("Четных чисел нет");
        }else{
            System.out.println("Массив без четных: "+ Arrays.toString(deleteEven(array, arrayLength - evenEntries)));
        }

    }
    public static boolean isValid(int num){
        return num > 5 && num <= 10;
    }

    public static void arrayFill(int[] arr){
        for(int n=0; n<arr.length;n++){
            arr[n] = (int)(Math.random()*10);
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int evenEntriesCount(int[] arr){
        int counter = 0;
        for (int i : arr) {
            if (isEven(i)) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] deleteEven(int[] arr, int length){
        int[] returnArr = new int[length];
        int counter = 0;
        for (int i : arr) {
            if (!isEven(i)) {
                returnArr[counter] = i;
                counter++;
            }
        }
        return returnArr;
    }
}