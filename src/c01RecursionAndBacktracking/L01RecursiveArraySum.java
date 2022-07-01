package c01RecursionAndBacktracking;

import java.util.Arrays;
import java.util.Scanner;

public class L01RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = sumNumbers(arr, 0);

        System.out.println(sum);
    }

    public static int sumNumbers(int[] numbers, int index){
        if (index >= numbers.length){
            return 0;
        }

        return numbers[index] + sumNumbers(numbers, index + 1);
    }
}
