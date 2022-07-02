package c01RecursionAndBacktracking;

import java.util.*;
import java.util.stream.Collectors;

public class L03Generating0_1Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] memory = new int[n];
        Arrays.fill(memory, 3);

        fillVector(memory, 0);
    }

    public static void fillVector(int[] memory, int index){
        if (index >= memory.length){
            print(memory);
            return;
        }

        for (int i = 0; i <= 1; i++) {
            memory[index] = i;
            fillVector(memory, index + 1);
        }

    }

    public static void print(int[] memory){
        for (int i = 0; i < memory.length; i++) {
            System.out.print(memory[i]);
        }

        System.out.println();
    }
}
