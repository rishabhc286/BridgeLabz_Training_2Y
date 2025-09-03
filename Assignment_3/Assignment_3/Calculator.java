import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input values
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        // Step 2: Perform operation using switch...case
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result = " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result = " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result = " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator! Please use +, -, * or /");
        }

        sc.close();
    }
}
