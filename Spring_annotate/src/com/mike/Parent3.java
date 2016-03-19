package com.mike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Parent3{
	
	@Autowired (required=true)
    @Qualifier ("default")
	BarDI_interface barDI;
	
	public Parent3() {
		
	}
	
	public void sayMessage()
	{
		System.out.println("Parent3 says message: " + barDI.getMessage());
	}
	
}
