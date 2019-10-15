package com.epam.team_8.java.lesson1.task3;

public enum Operations {
    SUM("+"), SUB("-"), MUL("*"), DIV("/");

    private String operationSign;

    Operations(String operationSign) {
        this.operationSign = operationSign;
    }

    public String getOperationSign() {
        return operationSign;
    }

    public static Operations getOperation(String operationSign) {
        Operations[] operations = Operations.values();
        Operations result = null;
        for (Operations operation : operations) {
            if (operation.operationSign.equals(operationSign)) {
                result = operation;
            }
        }
        return result;
    }
}
