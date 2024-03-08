package src.task_1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.showTriangle(6);
        shape.showSquare(4);
        System.out.println(shape.calculateSquare(3));

        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 6));
        System.out.println(calc.substract(5, 6));
        System.out.println(calc.multiply(5, 6));
        System.out.println(calc.division(5, 6));
        calc.showCalculator();


    }
}
