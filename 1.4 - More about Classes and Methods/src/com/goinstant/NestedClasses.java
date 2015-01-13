package com.goinstant;

public class NestedClasses {

	// - A "static nested" class (or just "nested" class) is a static class
	// inside another class. Use a nested class when you have one class that
	// only makes sense in the context of another.
	// - Behaviorally, a static nested class is the same as a top-level class.
	// - If your nested class is non-trivial, it is probably better to have it
	// as a top-level class in its own file.
	public static class Nested {

	}

	public static void main(String[] args) {

		// Inside the same file you do not need to qualify the class name:
		Nested a = new Nested();

		// Outside of this file you would qualify the class name as follows:
		NestedClasses.Nested b = new NestedClasses.Nested();

	}

}
