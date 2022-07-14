package c04SearchingSortingAndGreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class L02MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        mergeSort(arr);

        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));

        System.out.println();
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;

        if (n < 2){
            return;
        }

        int mid = n / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftLength && j < rightLength){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while(i < leftLength){
            arr[k] = left[i];
            k++;
            i++;
        }

        while (j < rightLength){
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}
