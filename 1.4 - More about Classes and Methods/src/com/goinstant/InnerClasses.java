package com.goinstant;

public class InnerClasses {

	static class OuterClass {

		String a;
		String b;

		OuterClass(String a, String b) {
			this.a = a;
			this.b = b;
		}

		// InnerClass here is non-static; and is thus a member of a specific
		// instance of OuterClass, and has access to its member fields.
		class InnerClass {
			void doSomething() {
				System.out.println(a + " " + b);
			}
		}
	}

	public static void main(String[] args) {

		OuterClass outer = new OuterClass("foo", "bar");

		// Note the syntax: you can't directly construct InnerClass instances
		// without referencing the OuterClass instance they belong to.
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.doSomething();

		// Inner classes are usually not what you want. Nested classes are
		// preferable in most situations (see Effective Java Item #22).
	}
}
