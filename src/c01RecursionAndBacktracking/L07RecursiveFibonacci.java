package c01RecursionAndBacktracking;

import java.util.Scanner;

public class L07RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(recursiveFibonacci(n));
    }

    public static long recursiveFibonacci(int n){
        if (n <= 1){
            return 1;
        }

        long fibN = recursiveFibonacci(n - 2);
        return fibN + recursiveFibonacci(n - 1);
    }
}