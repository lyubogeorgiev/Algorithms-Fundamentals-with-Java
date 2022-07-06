package c02CombinatorialProblems;

import java.util.Scanner;

public class CombinationsWithoutRepetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split("\\s+");

        int k = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                System.out.println(elements[i] + " " + elements[j]);
            }
        }
    }
}
