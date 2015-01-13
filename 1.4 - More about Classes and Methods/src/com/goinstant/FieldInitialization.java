package com.goinstant;

public class FieldInitialization {

	// Normally you initialize members in a constructor.
	private final boolean booleanMember;

	public FieldInitialization(boolean initialValue) {
		booleanMember = initialValue;
		// The constructor MUST initialize a value for all final fields.
	}

	// Members that are not explicitly initialized will get a default value.
	// Note this is NOT true for local variables inside a method.
	private int foo; // == 0
	private Object bar; // == null

	// Simple initial values can be provided inline. This is preferred to
	// constructors.
	private int baz = 5;
	private String blaarg = "blaarg";

	// Complex values can be initialized using an initialization block. This is
	// fairly rare; usually the code is just put in a constructor (which is what
	// the compiler does with it). The primary use case is to share
	// initialization code between multiple constructors.
	private String complexString;
	{
		StringBuilder builder = new StringBuilder();
		builder.append("foo").append("bar");
		complexString = builder.toString();
	}

	// Static variables can be initialized using a static initialization block.
	// This is more common than instance initialization blocks. The static block
	// is only executed once
	private static String staticComplex;
	static {
		StringBuilder builder = new StringBuilder();
		builder.append("foo").append("bar");
		staticComplex = builder.toString();
	}

	public void doSomething() {
		Object obj;
		System.out.println(bar);
		// System.out.println(obj); // error !
	}
}
