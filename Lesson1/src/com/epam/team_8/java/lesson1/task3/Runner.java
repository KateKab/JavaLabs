package com.epam.team_8.java.lesson1.task3;

public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ConsoleReader reader = new ConsoleReader();
        try {
            System.out.println("Input operand: ");
            double operand1 = reader.getOperand();
            System.out.println("Input operand: ");
            double operand2 = reader.getOperand();
            System.out.printf("Input operation sign between:\n" + "+, -, *, /\n");
            Operations operation = reader.getOperation();
            double result = calculator.calculate(operand1, operand2, operation);
            System.out.printf("%g %s %g = %g", operand1, operation.getOperationSign(), operand2, result);
        } finally {
            reader.closeScanner();
        }

    }
}
