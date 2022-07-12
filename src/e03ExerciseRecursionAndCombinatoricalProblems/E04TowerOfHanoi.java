package e03ExerciseRecursionAndCombinatoricalProblems;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;


public class E04TowerOfHanoi {
    public static Deque<Integer> source = new ArrayDeque<>();
    public static Deque<Integer> destination = new ArrayDeque<>();
    public static Deque<Integer> spare = new ArrayDeque<>();
    public static int step = 1;

    public static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int disc = Integer.parseInt(scanner.nextLine());
        for (int i = disc; i >= 1; i--) {
            source.push(i);
        }

        print();
        solve(disc, source, destination, spare);

        System.out.println(builder.toString());
    }

    public static void solve(int disc, Deque<Integer> source, Deque<Integer> destination, Deque<Integer> spare){
        if (disc == 1){
            destination.push(source.pop());
            builder.append("Step #")
                    .append(step++)
                    .append(": Moved disk")
                    .append(System.lineSeparator());
            print();
        } else {
            solve(disc - 1, source, spare, destination);
            solve(1, source, destination, spare);
            solve(disc - 1, spare, destination, source);
        }
    }

    public static void print(){
        builder.append("Source: ")
                .append(source.stream()
                        .sorted(Comparator.reverseOrder())
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")))
                .append(System.lineSeparator());
        builder.append("Destination: ")
                .append( destination.stream()
                        .sorted(Comparator.reverseOrder())
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")))
                .append(System.lineSeparator());
        builder.append("Spare: ")
                .append(spare.stream()
                        .sorted(Comparator.reverseOrder())
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")))
                .append(System.lineSeparator())
                .append(System.lineSeparator());
    }
}