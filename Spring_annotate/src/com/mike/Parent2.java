package com.mike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Parent2{
	
	@Autowired (required=true)
    @Qualifier ("bar2")
	BarDI_interface barDI;
	
	public Parent2() {
		
	}
	
	public void sayMessage()
	{
		System.out.println("Parent2 says message: " + barDI.getMessage());
	}
	
}
