
public class EvenAndOddNum {
    void Num(){
        System.out.println("-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5");
    }
    public void showPositiveEvenNums(int[] numb) {
        System.out.println("Positive even numbers:");
        for (int num : numb) {
            if (num > 0 && num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public void showNegativeOddNums(int[] numb) {
        System.out.println("Negative odd numbers:");
        for (int num : numb) {
            if (num < 0 && num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

}

