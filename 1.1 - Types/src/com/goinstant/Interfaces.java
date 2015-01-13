package com.goinstant;

public class Interfaces {

	// An Interface is like a Class but cannot have an implementation** or
	// members, only method declarations.
	public interface Interface {
		// All methods are inherently public in an Interface, so there are no
		// visibility modifiers.
		void doFoo();

		void doBar();
	}

	// Implementors can implement one or more interfaces
	public static class InterfaceImplementor implements Interface {
		@Override
		// We'll cover annotations later.
		public void doFoo() {
			System.out.println("foo");
		}

		@Override
		public void doBar() {
			// TODO Auto-generated method stub

		}
	}

	public static class InterfaceConsumer {
		// You can treat the interface like any other type, without knowing the
		// actual concrete class.
		public void doSomething(Interface implementor) {
			implementor.doFoo();
		}
	}

	public static void main(String[] args) {
		InterfaceImplementor a = new InterfaceImplementor();
		InterfaceConsumer b = new InterfaceConsumer();

		b.doSomething(a); // prints "foo"
	}

	// ** Interfaces can have default implementations in Java8, this will be
	// covered in a future presentation.
}
