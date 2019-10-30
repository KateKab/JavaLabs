package com.epam.team_8.java.lesson1.task3;

public class Calculator {

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

    public double calculate(double operator1, double operator2, Operations operation) {
        double result = 0;
        switch (operation) {
            case SUM:
                result = summarize(operator1, operator2);
                break;
            case SUB:
                result = subtract(operator1, operator2);
                break;
            case MUL:
                result = multiply(operator1, operator2);
                break;
            case DIV:
                result = divide(operator1, operator2);
                break;
            default:
                System.out.println("Invalid operation sign");
        }
        return result;
    }
}
