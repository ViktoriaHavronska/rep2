package src;

public class Calculator {
    int sum(int num1, int num2) {
        return num1 + num2;
    }

    int substract(int num1, int num2) {
        return num1 - num2;
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    int division(int num1, int num2) {
        return num1 / num2;
    }

    void showCalculator() {
        System.out.println("int sum (int num1, int num2);");
        System.out.println("int substract (int num1, int num2;");
        System.out.println("int multiply(int num1, int num2);");
        System.out.println("int division(int num1, int num2);");
    }
}
