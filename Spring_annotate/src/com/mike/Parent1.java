package com.mike;

public class Parent1{
	
	BarDI_interface barDI;
	
	public Parent1() {
		
	}

	public void sayMessage()
	{
		System.out.println("parent1 says message: " + barDI.getMessage());
	}

	public BarDI_interface getBarDI_interface() {
		return barDI;
	}

	public void setBarDI_interface(BarDI_interface someDI) {
		this.barDI = someDI;
	}

	
	
}
