package e03ExerciseRecursionAndCombinatoricalProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E05CombinationsWithoutRepetitions {
    static int[] elements;
    static int[] combinations;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        elements = new int[m];
        combinations = new int[n];

        fillElements(elements);

        combine(0, 0);
    }

    public static void combine(int index, int start){
        if (index == combinations.length){
            print(combinations);
        } else {
            for (int i = start; i < elements.length; i++) {

                combinations[index] = elements[i];
                combine(index + 1, i + 1);
            }
        }
    }

    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void fillElements(int[] elements){
        for (int i = 0; i < elements.length; i++) {
            elements[i] = i + 1;
        }
    }
}
