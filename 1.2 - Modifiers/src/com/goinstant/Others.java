package com.goinstant;

public class Others {

	// Transient variables are not serialized with the class.
	public transient String a = "transient";

	// The volatile keyword has to do with memory semantics in a multi-threaded
	// environment. Bit beyond the scope of this lesson.
	public volatile String c = "volatile";

}
