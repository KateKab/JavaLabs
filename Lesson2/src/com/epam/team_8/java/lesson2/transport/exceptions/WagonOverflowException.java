package com.epam.team_8.java.lesson2.transport.exceptions;

public class WagonOverflowException extends Throwable {

    private static final String ERROR_MESSAGE = "Error: No more seats in the wagon.";

    public WagonOverflowException() {
        super(ERROR_MESSAGE);
    }

    public WagonOverflowException(String message) {
        super(message);
    }

    public WagonOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public WagonOverflowException(Throwable cause) {
        super(cause);
    }

    public WagonOverflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
