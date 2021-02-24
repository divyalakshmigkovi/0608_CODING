package com.toyrobot.exception;

/**
 * This is an exception class that is used when the input entered by the user from CLI is invalid.
 */
public class InvalidInputException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidInputException(String message) {
		super(message);
	}


}