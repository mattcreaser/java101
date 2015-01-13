package com.goinstant;

public class Primitives {

	byte a = 4; // 8 bit signed two's complement
	short b = 5; // 16 bit signed two's complement
	int c = 6; // 32 bit signed two's complement
	long d = 7L; // or 7.0L; 64 bit signed two's complement
	float e = 8f; // single precision 32-bit IEEE 754 floating point
	double f = 9d; // double-precision 64-bit IEEE 754 floating point
	boolean g = false;
	char h = 'b'; // note: single vs double quotes matter!

	// Java has arrays, but they're often passed over in favor of collections.
	// Java arrays are fixed length. They don't play nice with Generics.
	int[] arr = new int[] { 1, 2 };
	int[] arr2 = new int[2];

	public static void main(String[] args) {
		// Primitives can be compared with ==
		byte compare = 4;
		byte compareTo = 4;
		System.out.println(compare == compareTo); // true

		// For objects, == checks that the reference is the same.
		// You almost always want to use ".equals()" instead.
		Integer i = new Integer(3);
		Integer j = new Integer(3);
		System.out.println(i == j); // false
		System.out.println(i.equals(j)); // true

		// If string literals are used, some compilers will reuse the memory, so
		// == works. This is dangerous if the intention is to compare the string
		// contents however.
		String stringA = "a";
		String stringB = "a";
		String stringC = new String("a");
		System.out.println(stringA == stringB); // true
		System.out.println(stringA == stringC); // false
		System.out.println(stringA.equals(stringC)); // true

		int[] arr = new int[2]; // defaults entries to 0
		arr[0] = 3;
		System.out.println(arr.length);
		System.out.println(arr[0] + " " + arr[1]);
	}

}
