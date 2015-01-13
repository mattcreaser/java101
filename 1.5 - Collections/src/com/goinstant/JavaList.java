package com.goinstant;

import java.util.ArrayList;
import java.util.List;

// java.util.List is possibly the most used collection class.
// A list is an ordered collection, so it's most analogous to
// an array, with the crucial difference being that a List is
// a higher-level abstraction that can grow and shrink as
// needed.
// 
// There are several different implementations of the the List
// interface in the standard Java class library, the most
// important are ArrayList and LinkedList; with the main
// difference being differing performance characteristics.
public class JavaList {

	public static void main(String[] args) {

		// An ArrayList is backed by an array. Once the array is filled a larger
		// array must be allocated, which can be expensive; you should
		// initialize the ArrayList to your expected maximum size if you expect
		// it to grow a lot.
		// Removal from an ArrayList can also be expensive since all the items
		// after must be shifted up one index.
		// A LinkedList doesn't have these draw backs, but indexing into the
		// middle of the LinkedList is expensive.
		List<String> list = new ArrayList<String>();

		list.add("foo");
		list.add("bar");
		list.add("baz");

		list.remove("bar");

		// Since a list is ordered, the output here is predictable.
		for (final String s : list) {
			System.out.println(s);
		}
	}
}
