package com.goinstant;

import java.util.ArrayList;
import java.util.List;

// Autoboxing is a Java 5 feature whereby the compiler will automatically
// insert code to convert primitives to/from their Object wrappers when
// appropriate.
//
// This allows, for example, primitives to be used in Collections without
// writing a ton of boilerplate conversion calls.
//
// It's not part of the collections framework but I thought this was an
// appropriate place to talk about it.
//
// Some of the autoboxed types are:
//   char <-> Character
//   boolean <-> Boolean
//   int <-> Integer
//   float <-> Float
//   ... etc for other primitives.
public class Autoboxing {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		// Before autoboxing came along, you'd have to do this:
		list.add(Integer.valueOf(1));
		// Shitty, right? Now you can just add the primitive directly:
		list.add(2);
		// And the compiler will generate the appropriate conversion code.

		// Unboxing does the same thing in reverse.
		Integer one = new Integer(1);
		int oneInt = one.intValue();
		int oneIntUnboxed = one;

		// With autoboxing you can pretty much intermix primitives and their
		// wrapper types as much as you like:
		Integer five = 5;
		int result = five + 2;

		// With that being said, you have to be aware of the overhead: every
		// Integer, for example, is an Object that must be allocated. Most of
		// the time this minimal hit won't matter, but spurious use of
		// autoboxing on high volume code paths can introduce a measurable
		// effect.
		int id = getId();
	}

	private static Integer getId() {
		return 5;
	}
}
