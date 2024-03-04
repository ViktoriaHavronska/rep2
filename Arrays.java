public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {5, -20, 35, -3, 262, -92, 13, 0, -19, 80};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "; ");
        }

        System.out.println("  ");

        for (int i = numbers.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int t = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = t;
                }
            }
            System.out.print(numbers[i]+"; ");
        }
    }
}
