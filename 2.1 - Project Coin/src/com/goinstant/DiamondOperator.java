package com.goinstant;

import java.util.ArrayList;
import java.util.List;

// The diamond operator was added in Java 7. It lets you omit duplicate type 
// information with Generics in cases where it can be inferred.
public class DiamondOperator {

	public static void main(String[] args) {

		// Before Java 7
		List<String> list = new ArrayList<String>();

		// After Java 7
		List<String> list2 = new ArrayList<>();

		// The reason for the existence of the diamond operator is to
		// distinguish instances where the generic type is being inferred from
		// instances where there is not a generic type. The following will work
		// fine but is strongly discouraged (it is compiler warning):
		List<String> list3 = new ArrayList();
		// Because you can easily lose type safety when using raw types:
		List<Integer> ints = new ArrayList<>();
		List<String> strings = new ArrayList(ints);
		// List<String> strings2 = new ArrayList<>(ints); // error !
	}

}
