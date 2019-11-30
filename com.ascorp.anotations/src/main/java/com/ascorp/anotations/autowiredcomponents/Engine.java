package com.ascorp.anotations.autowiredcomponents;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value(value = "discover")
	private String enginename;

	@Value(value = "100CC")
	private String capacity;

	public String getEnginename() {
		return enginename;
	}

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
