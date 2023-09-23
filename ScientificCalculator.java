import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator!");
        System.out.println("Available operations: +, -, *, /, sin, cos, tan, log");

        while (true) {
            System.out.print("Enter operation (or 'exit' to quit): ");
            String operation = scanner.nextLine().trim();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result = 0.0;

            switch (operation.toLowerCase()) {
                case "+":
                    result = performAddition(scanner);
                    break;
                case "-":
                    result = performSubtraction(scanner);
                    break;
                case "*":
                    result = performMultiplication(scanner);
                    break;
                case "/":
                    result = performDivision(scanner);
                    break;
                case "sin":
                    result = performSine(scanner);
                    break;
                case "cos":
                    result = performCosine(scanner);
                    break;
                case "tan":
                    result = performTangent(scanner);
                    break;
                case "log":
                    result = performLogarithm(scanner);
                    break;
                default:
                    System.out.println("Invalid operation. Try again.");
                    break;
            }

            System.out.println("Result: " + result);
        }
    }

    private static double performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        return num1 + num2;
    }

    private static double performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        return num1 - num2;
    }

    private static double performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        return num1 * num2;
    }

    private static double performDivision(Scanner scanner) {
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        if (denominator == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }

        return numerator / denominator;
    }

    private static double performSine(Scanner scanner) {
        System.out.print("Enter angle in radians: ");
        double angle = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        return Math.sin(angle);
    }

    private static double performCosine(Scanner scanner) {
        System.out.print("Enter angle in radians: ");
        double angle = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        return Math.cos(angle);
    }

    private static double performTangent(Scanner scanner) {
        System.out.print("Enter angle in radians: ");
        double angle = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        return Math.tan(angle);
    }

    private static double performLogarithm(Scanner scanner) {
        System.out.print("Enter number for logarithm (base 10): ");
        double num = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        if (num <= 0) {
            System.out.println("Error: Logarithm of non-positive number");
            return Double.NaN;
        }

        return Math.log10(num);
    }
}
