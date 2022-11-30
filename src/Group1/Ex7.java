package Group1;

import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {

        int[] array = {10,5,76,3,2,5};
        System.out.println("Массив: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

    }

    public static void bubbleSort(int[] arr){
        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int n = 0; n < arr.length-1; n++) {
                if(arr[n] > arr[n+1]){
                    isSorted = false;
                    tmp = arr[n];
                    arr[n] = arr[n+1];
                    arr[n+1] = tmp;
                }
            }
        }
    }
}