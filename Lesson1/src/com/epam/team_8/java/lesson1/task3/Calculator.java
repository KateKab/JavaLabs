package com.epam.team_8.java.lesson1.task3;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);

    public void closeScanner() {
        scanner.close();
    }

    public double getOperand() {
        System.out.println("Input operand: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public char getOperation() {
        System.out.printf("Input operation sign between:\n" + "+, -, *, /\n" );
        char operation = scanner.next().charAt(0);
        return operation;
    }

    private double summarize(double operator1, double operator2) {
        double result = operator1 + operator2;
        return result;
    }

    private double subtract(double operator1, double operator2) {
        double result = operator1 - operator2;
        return result;
    }

    private double multiply(double operator1, double operator2) {
        double result = operator1 - operator2;
        return result;
    }

    private double divide(double operator1, double operator2) {
        double result = operator1 / operator2;
        return result;
    }

    public double calculate(double operator1, double operator2, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = summarize(operator1, operator2);
                break;
            case '-':
                result = subtract(operator1, operator2);
                break;
            case '*':
                result = multiply(operator1, operator2);
                break;
            case '/':
                result = divide(operator1, operator2);
                break;
            default:
                System.out.println("Invalid operation sign");
        }
        return result;
    }


}
