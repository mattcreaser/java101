package com.goinstant;

public class Protected {

	// Only this class, other classes in this package, and any derived classes
	// can access this variable.
	protected String member = "Protected";

	// This method can be overridden in a derived class.
	protected void doSomething() {
		System.out.println("doin something");
	}
}
