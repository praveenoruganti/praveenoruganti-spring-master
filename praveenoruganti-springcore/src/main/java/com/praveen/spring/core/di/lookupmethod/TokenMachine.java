package com.praveen.spring.core.di.lookupmethod;

public abstract class TokenMachine {

	public void findToken() {
		System.out.println("Token has been generated " + generateToken());
	}

	public abstract Token generateToken();
	
	private Token token;

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}
	
	

}
