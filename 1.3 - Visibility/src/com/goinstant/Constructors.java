package com.goinstant;

// Every class has a public no-args constructor by default, unless you define
// at least one constructor explicitly. A common pattern is to define a single
// empty constructor as private, which effectively prevents anyone external
// from instantiating the class.
//
// This example creates a factory pattern where only the #make method can
// be used to build instances of this class. Another common idiom is to
// have a private constructor for singleton classes.
public class Constructors {

	// This constructor is private, therefore it can not be called from outside
	// of this class.
	private Constructors() {

	}

	// This method can call the private constructor.
	public static Constructors make() {
		return new Constructors();
	}

}
