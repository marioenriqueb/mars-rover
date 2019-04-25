package com.exercise.exception;

public class InvalidJsonException extends TransactionException{

    public InvalidJsonException(String string) {
	super(string);
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
}
