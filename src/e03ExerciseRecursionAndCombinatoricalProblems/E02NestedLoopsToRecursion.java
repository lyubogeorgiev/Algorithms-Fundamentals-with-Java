package e03ExerciseRecursionAndCombinatoricalProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class E02NestedLoopsToRecursion {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        arr = new int[n];

        permute(0);
    }

    public static void permute(int index){
        if (index == arr.length){
            print(arr);
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[index] = i + 1;
                permute(index + 1);
            }
        }
    }

    public static void print(int[] arr){
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));

        System.out.println();
    }
}
