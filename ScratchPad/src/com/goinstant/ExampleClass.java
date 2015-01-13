package com.goinstant;

import java.util.Collection;
import java.util.HashSet;

public class ExampleClass {

	public void add(String string) {
		strings.add(string);
	}

	public void printAll() {
		for (String s : strings) {
			System.out.println(s);
		}
	}

	private Collection<String> strings = new HashSet<String>();
}
