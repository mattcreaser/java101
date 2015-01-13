package com.goinstant;

import java.util.HashMap;
import java.util.Map;

// A map is your Java dictionary class, but it can use any Object for keys.
// Like the other abstract collections, there are various concrete 
// implementations that primarily differ in their performance characteristics.
// I almost always use HashMap or rarely TreeMap.
public class JavaMap {

	public static void main(String[] args) {

		// The generic types are key, value. This Map has Strings as both key
		// and value.
		Map<String, String> map = new HashMap<>();

		map.put("foo", "bar");
		map.put("ham", "sandwich");

		// You can iterate keys and values together in an entry set. Note that
		// the HashMap class makes NO ordering promises, so the order that
		// these entries are printed is not predictable.
		// Other Map implementations may or may not make ordering promises.
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " maps to " + entry.getValue());
		}
		// there's also map.keySet() and map.values()

		// The Map interface contains other useful methods. The performance of
		// these methods depends on the Map implementation.
		// get
		// remove
		// containsKey
		// containsValue

		// One important distinction about Maps are that, although they are part
		// of the Collections Framework, a Map is not a Collection. The map
		// interface is "collection like", and the keySet, valueSet, and
		// entrySet are collection views into the Map, but the Map itself is not
		// a Collection because it has two generic types and two inputs to many
		// methods.

	}

}
