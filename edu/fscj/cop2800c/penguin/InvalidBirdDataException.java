// InvalidBirdDataException.java
// J. Washington
// 04/05/26
// Exception for invalid bird data

package edu.fscj.cop2800c.penguin;

public class InvalidBirdDataException extends Exception {
    public InvalidBirdDataException(String message) {
        super(message);
    }
}