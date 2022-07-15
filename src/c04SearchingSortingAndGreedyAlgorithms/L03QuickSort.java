package c04SearchingSortingAndGreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class L03QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        quickSort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end){
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1 , end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pivotIndex = start;

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot){
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
        }

        swap(arr, pivotIndex, end);

        return pivotIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
