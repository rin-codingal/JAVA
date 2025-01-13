import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 10, 13, 7, 3};
        Arrays.sort(numbers);

        System.out.println("Sorted numbers in array:");

        for (int i : numbers) {
            System.out.println(i);
          }
    }
}
