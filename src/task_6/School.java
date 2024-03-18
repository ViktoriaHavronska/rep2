package src.task_6;
public class School {
    public static void printAverageResult(int[] scores) {
        double averageScore = calculateAverage(scores);
        System.out.println("The average score for this user is: " + averageScore);

        if (averageScore <= 2) {
            System.out.println("BAD - please contact the student's parents");
        } else if (averageScore <= 3) {
            System.out.println("NORMAL - ask the student about homework in the next lesson");
        } else if (averageScore <= 4) {
            System.out.println("GOOD - students do well");
        } else {
            System.out.println("WOW - mention the result in the next lesson");
        }
    }

    private static double calculateAverage(int[] scores) {
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        return (double) totalScore / scores.length;
    }
}