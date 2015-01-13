package com.goinstant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// The Collections class (note the s) is a static API with various utility 
// methods for working with the Collections framework.
public class JavaCollections {

	public static void main(String[] args) {

		// Check the class reference for a full list of supported methods. Two
		// common uses are to sort a list and to create unmodifiable views into
		// a collection.

		List<String> list = new ArrayList<String>();
		list.add("c");
		list.add("aa");
		list.add("bbb");

		// Sort the list by natural ordering.
		Collections.sort(list);
		printIt(list);

		// Sort the list by length. You can use a Lambda function to make the
		// comparator much more concise.
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		printIt(list);

		// Make a lightweight unmodifiable view of the list. This is very
		// important for API design.
		List<String> unmodifiable = Collections.unmodifiableList(list);
		// unmodifiable.add("d"); // runtime error UnsupportedOperationException
	}

	static <T> void printIt(Collection<T> collection) {
		for (T object : collection) {
			System.out.println(object);
		}
		System.out.println("---");
	}

}
