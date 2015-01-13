package com.goinstant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 
 * Collection is the root interface of the Java Collection Hierarchy. It 
 * contains a small set of methods that are common to all types of 
 * collections, whether they are ordered, unordered, unique, etc.
 * 
 * There are various subinterfaces like List, Set, and Queue that have
 * more specific uses, each of which then have various concrete 
 * implementations for particular purposes. A Map is not a subinterface
 * of Collection but it does have several collection views (i.e. the
 * keys of a Map are a collection, the values are a collection, and
 * the combined key/value entries are a collection).
 * 
 * The point of the collection framework is that APIs can require
 * a higher level interface - e.g. Collection or Map - depending on their
 * specific needs, and that will allow consumers of the API to supply whatever
 * conforming implementation works for them.
 * 
 * The Collection framework is fully generic, so it has excellent type safety.
 * This means that you can't use Collections with primitives: you can't have
 * a List of ints; but autoboxed Integers work fine with a small overhead 
 * penalty.
 */
public class JavaCollection {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("foo");
		list.add("bar");
		list.add("baz");

		Set<String> set = new HashSet<>();
		set.add("tomato");
		set.add("lettuce");
		set.add("cheese");
		set.add("burger");

		Map<String, String> map = new HashMap<>();
		map.put("city", "halifax");
		map.put("province", "novascotia");
		map.put("country", "canada");

		printIt(list);
		printIt(set);
		// printIt(map); // error !
		printIt(map.entrySet());
	}

	static <T> void printIt(final Collection<T> collection) {
		System.out.println("There are " + collection.size()
				+ " elements in the collection.");

		// Collection is a subinterface of Iterable, so every collection
		// can be iterated over using an enhanced for loop.
		for (T object : collection) {
			System.out.println(object.toString());
		}
	}
}
