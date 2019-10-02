package com.epam.team_8.java.lesson1.task3;

public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            double operand1 = calculator.getOperand();
            double operand2 = calculator.getOperand();
            char operation = calculator.getOperation();
            double result = calculator.calculate(operand1, operand2, operation);
            System.out.printf("%g %c %g = %g", operand1, operation, operand2, result);
        } finally {
            calculator.closeScanner();
        }

    }
}
