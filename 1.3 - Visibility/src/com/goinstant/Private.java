package com.goinstant;

@SuppressWarnings("unused")
public class Private {

	// Only this class can access this member.
	private String member = "Private";

	// No one outside Private can see the class Nested.
	private static class Nested {

	}
}
