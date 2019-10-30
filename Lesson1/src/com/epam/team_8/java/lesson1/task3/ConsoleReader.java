package com.epam.team_8.java.lesson1.task3;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner = new Scanner(System.in);

    public void closeScanner() {
        scanner.close();
    }

    public double getOperand() {
        return Double.parseDouble(scanner.nextLine());
    }

    public Operations getOperation() {
        return Operations.getOperation(scanner.next());
    }
}
