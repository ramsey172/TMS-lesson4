import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int max = 0;
        int min = 99999;
        int val;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for(int n=0;n<arrayLength;n++){
            val = (int) (Math.random() * 10);
            if(val > max){
                max = val;
            }
            if(val < min){
                min = val;
            }
            sum+= val;
            array[n] = val;
        }
        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное значение: "+max);
        System.out.println("Минимальное значение: "+min);
        System.out.println("Среднее значение: "+sum*1.0/arrayLength); //костыль
    }
}