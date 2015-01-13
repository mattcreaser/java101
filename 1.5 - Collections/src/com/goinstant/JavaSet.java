package com.goinstant;

import java.util.HashSet;
import java.util.Set;

// A set is a collection that contains no duplicate elements.
// HashSet and TreeSet are the two main standard implementations.
// EnumSet is a specialized implementation that is optimized
// for enumeration values.
public class JavaSet {

	public static void main(String[] args) {

		final Set<String> set = new HashSet<>();

		set.add("foo");
		set.add("bar");
		set.add("foo"); // duplicate entry ignored.

		for (String s : set) {
			System.out.println(s);
		}

	}

}
