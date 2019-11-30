package com.ascorp.anotations.autowiredInject;

import org.springframework.beans.factory.annotation.Required;

public class Engine {

	
	private String enginename;
	private String capacity;

	public String getEnginename() {
		return enginename;
	}
	@Required
	public void setEnginename(String enginename) {
		this.enginename = enginename;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public void start() {
		System.out.println("Engine Is Starting......");
	}

	@Override
	public String toString() {
		return "Engine [enginename=" + enginename + ", capacity=" + capacity + "]";
	}
}
