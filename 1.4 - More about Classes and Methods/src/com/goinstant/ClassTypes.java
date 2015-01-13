package com.goinstant;

// The terminology around "nested", "inner" and "member" classes is very ambiguous. 
// Many sources use differing combinations of the above terms. 
// The official Java documentation uses:
// - Static member class: "Static Nested Class" - I shorten it to "Nested Class"
// - Non-static member class: "Inner Class"
// - Class defined in method: "Local Class"
// - Unnamed local class: "Anonymous Class"
//
// Unlike top-level classes (which must be public or package-private to be usable),
// nested/inner classes can use any appropriate visibility modifier.
@SuppressWarnings("unused")
public class ClassTypes {

	// This is a nested class that can be used by anyone.
	public static class NestedClass {

	}

	// This is an InnerClass that is only visible inside of ClassTypes.
	private class InnerClass {

	}

	public void doSomething() {
		// This is a local class visible only inside this method. No visibility
		// modifiers are permitted.
		class LocalClass {
		}

		LocalClass a = new LocalClass();
		InnerClass b = new InnerClass();
		NestedClass c = new NestedClass();

		// The variable d here is being initialized to a new anonymous class
		// that is derived from ClassTypes.
		ClassTypes d = new ClassTypes() {
			@Override
			public void doSomething() {
				// This line would cause a stack overflow. Can you see why?
				// super.doSomething();
			}
		};

		d.doSomething();
	}

	public static void main(String[] args) {
		ClassTypes ct = new ClassTypes();
		ct.doSomething();
	}

}
