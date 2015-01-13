package com.goinstant;

@SuppressWarnings("unused")
public final class Final {

	// A class that is final cannot be extended.
	// public class Derived extends Final { // error!
	// }

	public static class Super {
		// Similarly, a method that is final cannot be overridden.
		public final void doSomething() {
		}
	}

	public static class Child extends Super {
		// @Override
		// public void doSomething() { // error!
		//
		// }
	}

	// Final variables cannot be assigned. You should make all constants final.
	// Give them uppercase names to denote that it's constant.
	private static final int CONSTANT = 1;

	public static void main(String[] args) {
		// You can assign a final variable later as long as you only assign it
		// once on each code path.
		final String a;

		if (Math.random() > 0.5f) {
			a = "foo";
		} else {
			a = "bar";
		}

		// a = "baz"; // error!

		// "final" is similar to "const" from C++, but differs in a few ways. A
		// final Java variable just means that the identifier cannot be
		// modified, but the underlying object can still be changed (this would
		// be like calling a non-const method on a const C++ object).
	}

	// Rule of thumb: final all the things! Immutability helps prevent
	// programmer mistakes.
}
