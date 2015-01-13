package com.goinstant;

public class LocalClasses {

	public static void main(String[] args) {

		// Local classes are pretty straightforward: it works like a regular
		// class, but is only visible inside the method.
		//
		// There aren't a lot of situations that call for Local classes.
		// Anonymous or Nested classes are almost always a better choice.
		class LocalClass {
			String a;

			LocalClass(String a) {
				this.a = a;
			}

			@Override
			public String toString() {
				return a;
			}
		}

		LocalClass foo = new LocalClass("foo");
		LocalClass bar = new LocalClass("bar");

		System.out.println(foo + " " + bar);

		someOtherMethod();
	}

	static void someOtherMethod() {
		// LocalClass other = new LocalClass("other"); // error !
	}

}
