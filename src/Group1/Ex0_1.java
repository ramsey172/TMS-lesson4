package Group1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0_1 {
    public static void main(String[] args) {

        int[] arr = new int[]{1,4,6,8,9,8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начальный массив:"+Arrays.toString(arr));
        System.out.println("Введите число для поиска:");
        int search = scanner.nextInt();
        int entriesCount  = entriesCount(arr, search);
        if(entriesCount > 0){
            System.out.println(Arrays.toString(deleteByEntry(arr,search,arr.length - entriesCount)));
        }else{
            System.out.println("Нет вхождений");
        }
    }
    public static int entriesCount(int[] arr, int search){
        int counter = 0;
        for (int i : arr) {
            if (i == search) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] deleteByEntry(int[] arr, int search, int newLength){
        int[] returnArr = new int[newLength];
        int counter = 0;
        for (int i : arr) {
            if (i != search) {
                returnArr[counter] = i;
                counter++;
            }
        }
        return returnArr;
    }
}