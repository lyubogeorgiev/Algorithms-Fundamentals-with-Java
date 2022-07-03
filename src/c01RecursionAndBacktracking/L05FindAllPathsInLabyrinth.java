package c01RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L05FindAllPathsInLabyrinth {

    static List<Character> path = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        char[][] labyrinth = new char[m][n];

        for (int i = 0; i < labyrinth.length; i++) {
            labyrinth[i] = scanner.nextLine().toCharArray();
        }

        findPath(labyrinth, 0, 0, ' ');
    }

    public static void findPath(char[][] labyrinth, int row, int col, char direction){

        if (!isInBounds(labyrinth, row, col)
                || labyrinth[row][col] == 'V'
                || labyrinth[row][col] == '*'){
            return;
        }

        path.add(direction);

        if (labyrinth[row][col] == 'e'){
            printPath(path);
            removePath(path);
        } else {
//            path.add(direction);
            labyrinth[row][col] = 'V';

            findPath(labyrinth, row, col + 1, 'R');
            findPath(labyrinth, row + 1, col, 'D');
            findPath(labyrinth, row, col - 1, 'L');
            findPath(labyrinth, row - 1, col, 'U');

            labyrinth[row][col] = '-';

            removePath(path);
        }


    }

    public static void removePath(List<Character> path){
        path.remove(path.size() - 1);
    }

    public static boolean isInBounds(char[][] labyrinth, int row, int col){
        return row >= 0 && col >= 0 && row < labyrinth.length && col < labyrinth[0].length;
    }

    public static void printPath(List<Character> path){

        for (int i = 1; i < path.size(); i++) {
            System.out.print(path.get(i));
        }

        System.out.println();
    }
}
