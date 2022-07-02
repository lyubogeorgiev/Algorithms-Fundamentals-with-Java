package c01RecursionAndBacktracking;

import java.util.Scanner;

public class L04RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(findFactorial(n));
    }

    public static int findFactorial(int n){
        if (n <= 0){
            return 1;
        }

        return n * findFactorial(n - 1);
    }
}