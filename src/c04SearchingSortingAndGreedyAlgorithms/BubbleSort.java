package c04SearchingSortingAndGreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int end = numbers.length - 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < end; j++) {
                if (numbers[j] > numbers[j + 1]){
                    swap(numbers, j, j + 1);
                }

            }
            end--;
        }

        System.out.println(Arrays.toString(Arrays.stream(numbers).mapToObj(String::valueOf).toArray()));
    }

    private static void swap(int[] numbers, int j, int i) {
        int temp = numbers[j];
        numbers[j] = numbers[i];
        numbers[i] = temp;
    }
}
