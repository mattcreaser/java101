package com.goinstant;

// There are three annotations available from java.lang:
//  - @Override : Marks a method as overriding a super class; generates a warning if it doesn't.
//  - @Deprecated : Marks a unit as deprecated.
//  - @SupressWarnings : Used to ignore targeted compiler/lint warnings.
public class Standard {

	static class Parent {
		public void doSomething() {
			System.out.println("parent");
		}

		/**
		 * Deprecated methods should always be accompanied by a javadoc tag
		 * explaining why/what to do instead.
		 * 
		 * @deprecated Use {@link #doSomething()} instead.
		 */
		@Deprecated
		public void deprecated() {
			System.out.println("deprecated");
		}
	}

	static class Child extends Parent {
		@Override
		public void doSomething() {
			System.out.println("child");

			@SuppressWarnings("unused")
			int unused = 5;
		}
	}

	public static void main(String[] args) {
		Parent obj = new Child();

		obj.doSomething();

		obj.deprecated();
	}
}
