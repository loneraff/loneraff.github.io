import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result:" + Add(num1, num2));
                break;
            case 2:
                System.out.println("Result:" + Subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result:" + Multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result:" + Divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }

    public static double Add(double num1, double num2) {
        return num1 + num2;
    }

    public static double Subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double Multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double Divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero");
            return Double.NaN; // NaN (Not a Number) indicates an undefined result
        }
    }

}
