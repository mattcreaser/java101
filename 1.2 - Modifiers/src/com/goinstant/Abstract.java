package com.goinstant;

public class Abstract {

	// A class that is abstract cannot be instantiated. The class must be
	// abstract if it has one or more abstract methods.
	// It may optionally be abstract if there are no abstract methods.
	static abstract class Base {
		public void foo() {
			bar();
		}

		// An abstract method has no implementation.
		protected abstract void bar();
	}

	// The non-abstract concrete derived class implements the abstract method.
	static class Child extends Base {
		@Override
		public void bar() {
			System.out.println("whatever");
		}
	}

	public static void main(String[] args) {
		Base object = new Child();
		object.foo();
	}
}
