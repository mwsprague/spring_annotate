package com.mike;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Spring_XML_Main
{

	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:./spring/applicationContext.xml");
        Parent1 p1 = (Parent1) appContext.getBean("aParent1");
        p1.sayMessage();
        
        Parent2 p2 = (Parent2) appContext.getBean("aParent2");
        p2.sayMessage();
        
	}
	
	
}
