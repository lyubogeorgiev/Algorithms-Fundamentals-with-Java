package c01RecursionAndBacktracking;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        long[] result = new long[n + 1];
        Arrays.fill(result, 1);

        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        System.out.println(result[n]);
    }
}
