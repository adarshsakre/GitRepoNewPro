package practice;
import java.util.Arrays;

public class MinimumValues {
   
    public static int[] findMinimumValues(int[] numbers, int count) {
        int[] minimumValues = new int[count];
        Arrays.sort(numbers);

        for (int i = 0; i < count; i++) {
            minimumValues[i] = numbers[i];
        }

        return minimumValues;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 3, 4, 1, 2};
        int[] minimumValues = findMinimumValues(numbers, 3);

        System.out.println("First 3 Minimum Values: " + Arrays.toString(minimumValues));
    }

}
