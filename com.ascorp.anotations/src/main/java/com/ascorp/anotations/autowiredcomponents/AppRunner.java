package com.ascorp.anotations.autowiredcomponents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppRunner {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\main\\java\\com\\ascorp\\anotations\\autowiredcomponents\\application-context.xml");

		Vehical Vehical = context.getBean("vehical", Vehical.class);
		System.out.println(Vehical);
	}

}
