package c02CombinatorialProblems;

import java.util.Scanner;

public class L05CombinationsWithoutRepetition {
    static String[] elements;
    static String[] combinations;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());

        combinations = new String[k];

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

    public static void print(String[] array){
        System.out.println(String.join(" ", array));
    }
}
