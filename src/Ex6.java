import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {

        String[] array = {"Егор", "Зина", "Володя", "Алесь"};
        System.out.println("Массив: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

    }
}