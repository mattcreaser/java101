package com.goinstant.test;

import com.goinstant.Constructors;
import com.goinstant.Private;
import com.goinstant.Protected;
import com.goinstant.Public;

@SuppressWarnings("unused")
public class Visibility {

	public static class ProtectedChild extends Protected {
		public String getMember() {
			return member;
		}

		// We can override the baseclass method to make it more visible.
		@Override
		public void doSomething() {
			super.doSomething();
		}
	}

	private static class PrivateChild extends Private {
		public String getMember() {
			// return member; // error !
			return null;
		}
	}

	public static void main(String[] args) {

		// We can access a public member and public Nested Class.
		Public pub = new Public();
		System.out.println(pub.member);
		Public.Nested nested = new Public.Nested();

		// We cannot access the protected member because this class is in a
		// different package.
		Protected pro = new Protected();
		// System.out.println(pro.member); // error !
		// But we can access it via a child class that exposes it.
		ProtectedChild proChild = new ProtectedChild();
		System.out.println(proChild.getMember());
		// And we can call the overridden method.
		proChild.doSomething();

		// Note that if we reference the same object polymorphically through the
		// baseclass, we cannot call the overridden method because it is only
		// visible in the derived class.
		pro = proChild;
		// pro.doSomething(); error !

		// We cannot even see a package-private class because we are in a
		// different package.
		// PackagePrivate pacPri = new PackagePrivate(); // error !

		// We can't instantiate a Constructors instance directly because the
		// default constructor is private.
		// Constructors con = new Constructors(); // error !
		// But we can use it's factory method.
		Constructors con = Constructors.make();
	}

}
