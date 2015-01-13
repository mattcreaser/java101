package com.goinstant;

@SuppressWarnings("unused")
public class AnonymousClasses {

	interface Interface {
		void doSomething();
	}

	static abstract class AbstractClass {
		public abstract void doSomething();
	}

	static class ConcreteClass {
		protected String name;

		public ConcreteClass(String name) {
			this.name = name;
		}

		public void doSomething() {
			System.out.println("ConcreteClass: " + name);
		}
	}

	public static void main(String[] args) {

		// You can use an anonymous class to implement an interface for a
		// one-off use.
		Interface a = new Interface() {
			@Override
			public void doSomething() {
				System.out
						.println("This is an anonymous class implementing Interface.");
			}
		};

		// You can do the same for an abstract class.
		AbstractClass b = new AbstractClass() {
			@Override
			public void doSomething() {
				System.out
						.println("This is an anonymous class extending AbstractClass");
			}
		};

		// Also a concrete class.
		ConcreteClass c = new ConcreteClass("anonymous") {
			@Override
			public void doSomething() {
				System.out.println("Derived ConcreteClass: " + name);
				super.doSomething();
			}
		};

		// You can also extend Object with an anonymous class, but note that
		// doSomething will not be useable; it is not defined for the Object
		// class, and thus cannot be accessed from the "d" reference.
		Object d = new Object() {
			public void doSomething() {
				System.out
						.println("This is an anonymous class extending Object");
			}
		};

		a.doSomething();
		b.doSomething();
		c.doSomething();
		// Even though the anonymous class does have a doSomething method, there
		// is no type information that allows access to it.
		// d.doSomething(); // error !
	}
}
