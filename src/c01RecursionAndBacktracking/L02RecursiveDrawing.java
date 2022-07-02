package c01RecursionAndBacktracking;

import java.util.Arrays;
import java.util.Scanner;

public class L02RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        generateFirst('*', '#', n);
    }

    public static void generateFirst(char symbol1, char symbol2, int n){
        if (n <= 0){
            return ;
        }

        char[] charArr = new char[n];
        Arrays.fill(charArr, symbol1);

        System.out.println(String.valueOf(charArr));

        generateFirst(symbol1, symbol2, n - 1);

        charArr = new char[n];
        Arrays.fill(charArr, symbol2);

        System.out.println(String.valueOf(charArr));
    }

}
