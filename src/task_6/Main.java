package src.task_6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];

        System.out.println("Please input student scores for 5 last lessons:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        School.printAverageResult(scores);

    }
}