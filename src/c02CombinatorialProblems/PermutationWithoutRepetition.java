package c02CombinatorialProblems;

import java.util.Scanner;

public class PermutationWithoutRepetition {
    static String[] elements;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        permute(0);
    }

    public static void permute(int index){
        if (index == elements.length){
            print(elements);
        } else {
            for (int i = index; i < elements.length; i++) {
                swap(elements, index, i);
                permute(index + 1);
                swap(elements, index, i);
            }
        }
    }

    public static void print(String[] array){
        System.out.println(String.join(" ",array));
    }

    public static void swap(String[] elements, int index, int i){
        String temp = elements[index];
        elements[index] = elements[i];
        elements[i] = temp;
    }
}
