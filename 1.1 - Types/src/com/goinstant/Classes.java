// all top-level types belong to a package
// the package name mirrors the directory structure
// packages matter for visibility; see section 1.3
package com.goinstant;

// This is a top-level class.
// Top-level types must have the same name as the .java file.
// There is exactly one top-level type for each .java file.
public class Classes {

	// These are member variables for the class.
	public String foo;
	public String bar;

	// This is a method of the class.
	// There are no "functions" in Java, e.g.
	public String getFoo() {
		return foo;
	}

	// Methods that have the same name as the class are constructors for that
	// class.
	public Classes(String foo, String bar) {
		// We have to use "this" to disambiguate the variable names since there
		// are multiple in scope.
		// If the names were different we could omit "this".
		this.foo = foo;
		this.bar = bar;
	}

	public static void main(String[] args) {
		Classes instance = new Classes("foo", "bar");

		System.out.println(instance.getFoo());

		// All classes implicitly inherit from Object, so you can call any of
		// Object's methods on any instance.
		System.out.println(instance.hashCode());
	}
}
