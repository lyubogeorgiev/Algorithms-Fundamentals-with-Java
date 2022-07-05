package c02CombinatorialProblems;

import java.util.HashSet;
import java.util.Scanner;

public class L02PermutationsWithRepetition {

    static String[] elements ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        permute(0);
    }

    public static void permute(int index) {
        if (index == elements.length) {
            print();
        } else {
            permute(index + 1);

            HashSet<String> swapped = new HashSet<>();
            swapped.add(elements[index]);

            for (int i = index + 1; i < elements.length; i++) {
                if (!swapped.contains(elements[i])) {

                    swap(elements, index, i);
                    permute(index + 1);
                    swap(elements, index, i);
                    swapped.add(elements[i]);
                }
            }
        }
    }

    public static void swap(String[] elements, int index, int i){
        String temp = elements[index];
        elements[index] = elements[i];
        elements[i] = temp;
    }

    public static void print(){
        System.out.println(String.join(" ", elements));
    }
}
