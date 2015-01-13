package com.goinstant;

@SuppressWarnings("static-access")
public class Static {

	// Things that are static belong to the Class itself instead of to a
	// particular instance of that Class.

	public static String staticString = "Static";
	public String instanceString = "Instance";

	public static void classMethod() {
		System.out.println(staticString);

		// You cannot reference instance information from a static method,
		// because that data doesn't exist in this context.
		// System.out.println(instanceString); // error !
	}

	public void instanceMethod() {
		System.out.println(instanceString);

		// You CAN reference static members from an instance method, because
		// static members always exist.
		System.out.println(staticString);
	}

	public static void main(String[] args) {
		// Static method is invoked on the class.
		Static.classMethod();

		// Instance method is invoked on an instance of that class.
		Static instance = new Static();
		instance.instanceMethod();

		// You can also invoke static methods on instances, but this is frowned
		// upon and will give you a compiler warning.
		instance.classMethod();
	}

	// Static blocks are executed at class loading time. You should try to avoid
	// static blocks, they are often a code smell.
	static {
		System.out.println("this is printed first");
	}

	// Nested classes should almost always be static, otherwise every instance
	// of the outer class has its own Nested class type! We'll revisit this
	// talking about Nested vs Inner classes.
	public static class Nested {

	}
}
