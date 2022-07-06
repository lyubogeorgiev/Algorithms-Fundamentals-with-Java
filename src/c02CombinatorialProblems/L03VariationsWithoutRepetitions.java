package c02CombinatorialProblems;

import java.util.Scanner;

public class L03VariationsWithoutRepetitions {
    static String[] elements;
    static String[] variations;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        elements = input.split(" ");

        String input2 = scanner.nextLine();

        int k = Integer.parseInt(input2);

        variations = new String[k];
        used = new boolean[elements.length];

        variate(0);
    }

    public static void variate(int index){
        if (index == variations.length){
            print(variations);
        } else {
            for (int i = 0; i < elements.length; i++) {

                if (!used[i]){
                    used[i] = true;

                    variations[index] = elements[i];
                    variate(index + 1);
                    used[i] = false;
                }

            }
        }
    }

    public static void print(String[] array){
        System.out.println(String.join(" ", array));
    }
}
