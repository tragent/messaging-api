package org.tragent.daneil.messenger.exception;

public class DataNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -23456785678123456L;
	
	public DataNotFoundException(String message){
		super(message);
	}
}
