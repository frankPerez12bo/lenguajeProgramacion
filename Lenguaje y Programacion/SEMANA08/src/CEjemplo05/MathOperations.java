/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEjemplo05;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class MathOperations {
     private double number1;
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double add() {
        return number1 + number2;
    }

    public double subtract() {
        return number1 - number2;
    }

    public double multiply() {
        return number1 * number2;
    }

    public double divide() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
    }
}

public class MathCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int choice;

        do {
            System.out.println("\nMath Operations Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                mathOperations.setNumber1(scanner.nextDouble());
                System.out.print("Enter the second number: ");
                mathOperations.setNumber2(scanner.nextDouble());

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + mathOperations.add());
                        break;
                    case 2:
                        System.out.println("Result: " + mathOperations.subtract());
                        break;
                    case 3:
                        System.out.println("Result: " + mathOperations.multiply());
                        break;
                    case 4:
                        System.out.println("Result: " + mathOperations.divide());
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 5);

        System.out.println("Thank you for using the Math Calculator.");
    }
}
