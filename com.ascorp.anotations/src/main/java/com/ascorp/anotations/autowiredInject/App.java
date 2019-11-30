package com.ascorp.anotations.autowiredInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src\\main\\java\\com\\ascorp\\anotations\\autowiredInject\\config\\application-context.xml");

		/*
		 * Engine engine = context.getBean("engine", Engine.class); engine.start();
		 */

		Vehical vehical = context.getBean("vehical", Vehical.class);
		System.out.println(vehical);
	}
}
