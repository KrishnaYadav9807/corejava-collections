package com.ascorp.anotations.autowiredInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.*;

public class Vehical {

	// @Autowired(required = false)
	@Inject
	@Qualifier("ee")
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehical [engine=" + engine + "]";
	}

}
