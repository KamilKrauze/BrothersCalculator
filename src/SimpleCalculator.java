import java.util.Scanner;

import static java.lang.System.exit;

public class SimpleCalculator {

    static Scanner in = new Scanner(System.in);
    static double num1, num2, ans;
    static char op;

    public static void displayOperationsMenu() {
        System.out.println("--- Select Operation ---");
        System.out.println("a: Add");
        System.out.println("b: Subtract");
        System.out.println("c: Multiply");
        System.out.println("d: Division");
    }

    public static void setMathOperation() {
        boolean validOperation = false;

        displayOperationsMenu();

        while (!validOperation) {
            op = in.next().charAt(0);
            switch (op) {
                case 'a' -> {
                    ans = num1 + num2;
                    System.out.println(ans);
                    validOperation = true;
                }
                case 'b' -> {
                    ans = num1 - num2;
                    System.out.println(ans);
                    validOperation = true;
                }
                case 'c' -> {
                    ans = num1 * num2;
                    System.out.println(ans);
                    validOperation = true;
                }
                case 'd' -> {
                    ans = num1 / num2;
                    System.out.println(ans);
                    validOperation = true;
                }
                default -> System.out.println("Invalid input, try again");
            }
        }
    }

    public static void setNumberValues() {
        System.out.println("Enter first number: ");
        num1 = in.nextDouble();
        System.out.println("Enter second number: ");
        num2 = in.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println("---------- CALCULATOR ----------");
        setNumberValues();
        setMathOperation();

        exit(0); // Not necessary, but good practice.
    }
}
