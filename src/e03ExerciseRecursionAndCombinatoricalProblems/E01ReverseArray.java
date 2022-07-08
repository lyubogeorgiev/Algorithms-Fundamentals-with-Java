package e03ExerciseRecursionAndCombinatoricalProblems;

import java.util.Arrays;
import java.util.Scanner;

public class E01ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        printElement(0, array);
    }

    public static void printElement(int n, int[] array){
        if (n == array.length){
            return;
        } else {
            printElement(n + 1, array);
            System.out.print(array[n] + " ");
        }
    }
}
