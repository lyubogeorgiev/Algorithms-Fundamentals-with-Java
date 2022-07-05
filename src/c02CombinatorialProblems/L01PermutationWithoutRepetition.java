package c02CombinatorialProblems;

import java.util.Scanner;

public class L01PermutationWithoutRepetition {

    static String[] elements ;
    static String[] permutes ;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elements = scanner.nextLine().split("\\s+");

        permutes = new String[elements.length];
        used = new boolean[elements.length];

        permute(0);
    }

    public static void permute(int index){
        if (index == elements.length){
            print();
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (!used[i]){
                    used[i] = true;
                    permutes[index] = elements[i];
                    permute(index + 1);
                    used[i] = false;
                }
            }
        }
    }

    public static void print(){
        System.out.println(String.join(" ", permutes));
    }
}