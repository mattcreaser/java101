package com.goinstant;

// Java method overloading allows you to define the same method multiple times
// with different signatures. The compiler will call the right one.
public class MethodOverloads {

	public void doSomething(String a) {
		System.out.println(a);
	}

	// Overloads can differ on argument type.
	public void doSomething(int b) {
		System.out.println(b);
	}

	// They can also differ by argument number
	public void doSomething(String a, String b) {
		System.out.println(a + " " + b);
	}

	// You cannot overload based on the return type.
	// public String doSomething(String b) {} error!

	// Method overloading is very commonly used for constructors. Consider a
	// Logger class that can optionally prefix the logged messages.
	static class Logger {

		public Logger() {
			// Call through to the overloaded constructor to do the actual work.
			this(null);
		}

		public Logger(String prefix) {
			this.prefix = prefix;
			// ...
		}

		private String prefix;

	}
}
