import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Select an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Left Shift");
        System.out.println("6. Right Shift");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        int result = 0;

        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero");
                System.exit(0);
            }
        } else if (choice == 5) {
            result = num1 << num2;  // Left shift
        } else if (choice == 6) {
            result = num1 >> num2;  // Right shift
        } else {
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        System.out.println("Result: " + result);
    }
}
