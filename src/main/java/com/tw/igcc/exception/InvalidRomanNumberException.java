package com.tw.igcc.exception;

public class InvalidRomanNumberException extends RuntimeException{
	
	private static final long serialVersionUID = -8107127015880303492L;

	public InvalidRomanNumberException(String message) {
		super(message);
	}

}
