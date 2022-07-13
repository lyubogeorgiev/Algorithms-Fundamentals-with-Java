package c04SearchingSortingAndGreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class L01BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int element = Integer.parseInt(scanner.nextLine());

        System.out.println(indexOf(numbers, element));
    }

    private static int indexOf(int[] numbers, int element) {

        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;
            int current = numbers[middle];

            if (element < current){
                end = middle - 1;
            } else if (element > current){
                start = middle + 1;
            } else {
               return middle;
            }
        }

        return -1;
    }
}
