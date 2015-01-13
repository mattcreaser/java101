package com.goinstant;

public class Varargs {

	// A varargs argument uses three dots after the type.
	// It indicates that you can pass multiple values for the argument, via
	// either a sequence of values or an Array.
	public void printAll(String... args) {
		for (String s : args) {
			System.out.println(s);
		}
	}

	// Your varargs argument must be the last argument accepted to the method.
	public void printAllWithPrefix(String prefix, String... args) {
		for (String s : args) {
			System.out.println(prefix + ": " + s);
		}
	}

	public static void main(String[] args) {
		Varargs test = new Varargs();

		// You can pass a sequence of values for the varargs.
		test.printAll("a", "b", "c");

		// You can also pass an array.
		String[] array = new String[] { "d", "e", "f" };
		test.printAllWithPrefix("foo", array);
	}

}
