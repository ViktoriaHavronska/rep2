package src.task_3;

public class Main {
    public static void main(String[] args) {

        EvenAndOddNum eaON = new EvenAndOddNum();
        eaON.num();
        int[] arr = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println("Positive even numbers:");
        eaON.showPositiveEvenNums(arr);

        System.out.println("Negative odd numbers:");
        eaON.showNegativeOddNums(arr);

    }
}
