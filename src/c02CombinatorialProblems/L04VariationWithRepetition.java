package c02CombinatorialProblems;

import java.util.Scanner;

public class L04VariationWithRepetition {

    static String[] elements;
    static String[] variations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());
        variations = new String[k];

        variate(0);
    }

    public static void variate(int index){
        if (index == variations.length){
            print(variations);
        } else {
            for (int i = 0; i < elements.length; i++) {
                variations[index] = elements[i];
                variate(index + 1);
            }
        }
    }

    public static void print(String[] array){
        System.out.println(String.join(" ", array));
    }
}
