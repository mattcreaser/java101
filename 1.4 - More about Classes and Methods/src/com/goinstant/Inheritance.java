package com.goinstant;

// Inheritance in Java is full implementation inheritance: derived 
// classes inherit both the interface and the implementation from 
// their parents.
//
// Java is single inheritance; you can only inherit from a single
// parent class (usually called the super class).
//
public class Inheritance {

	// Implicitly derives from Object.
	public static class Parent {
		void doSomething() {
			System.out.println("parent");
		}

		void doSomethingElse() {
			System.out.println("something else");
		}
	}

	public static class Child extends Parent {
		// Derived classes can override methods from the parent class.
		// The annotation is optional but strongly encouraged.
		@Override
		void doSomething() {
			System.out.println("child");

			// They can then call through to the parent using the super keyword.
			super.doSomething();
		}
	}

	public static class GrandChild extends Child {

	}

	public static void main(String[] args) {
		Parent object = new GrandChild();
		object.doSomething();
		object.doSomethingElse();
	}

}
