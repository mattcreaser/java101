package com.goinstant;

// This class does not have a visibility modifier, so it is package-private by default.
// This class is not visible outside of it's package.
class PackagePrivate {

	// This variable is only visible inside of this package. Derived classes
	// outside of the package cannot see it.
	String member = "PackagePrivate";

}
