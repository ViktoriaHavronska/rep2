package src.task_3;

public class EvenAndOddNum {
    void num() {
        System.out.println("-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5");
    }

    public void showPositiveEvenNums(int[] numb) {
        for (int num : numb) {
            if (num > 0 && num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public void showNegativeOddNums(int[] numb) {
        for (int num : numb) {
            if (num < 0 && num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

}

