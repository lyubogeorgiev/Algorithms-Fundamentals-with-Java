package c01RecursionAndBacktracking;

import java.util.Arrays;
import java.util.Scanner;

public class L02RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //non-recursive solution
//        for (int i = n; i > 0 ; i--) {
//            System.out.println("*".repeat(i));
//        }
//
//        for (int i = 1; i <= n; i++) {
//            char[] currentCharArr = new char[i];
//            Arrays.fill(currentCharArr, '#');
//
//            System.out.println(String.valueOf(currentCharArr));
//        }

        //recursive method

        generateFirst('*', n);
        generateSecond('#', n, 1);
    }

    public static String generateFirst(char symbol, int n){
        if (n <= 0){
            return "";
        }

        char[] charArr = new char[n];
        Arrays.fill(charArr, symbol);

        System.out.println(String.valueOf(charArr));

        return generateFirst(symbol, n - 1);
    }

    public static String generateSecond(char symbol, int n, int startIndex){
        if (n <= 0){
            return "";
        }

        char[] charArr = new char[startIndex];
        Arrays.fill(charArr, symbol);

        System.out.println(String.valueOf(charArr));

        return generateSecond(symbol, n - 1, startIndex + 1);
    }
}
