package com.mike;

public class Bar implements BarDI_interface {

	String message;
	
	public Bar() {
		message = "default message";
	}

	
	public Bar(String message) {
		this.message = message;
	}


	@Override
	public void setMessage(String s) {
	    message = s;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
