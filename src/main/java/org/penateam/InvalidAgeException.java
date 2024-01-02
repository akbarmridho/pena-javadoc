package org.penateam;

/**
 * Exception class for invalid age (age less than 0)
 * This class extend the exception class. Please refer to its base class for more information
 *
 * @see java.lang.Exception
 */
public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Age should be more or equal than 0");
    }
}
