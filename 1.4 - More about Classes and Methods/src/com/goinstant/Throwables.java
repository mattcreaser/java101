package com.goinstant;

// Java has two types of exceptions:
// - Checked Exceptions:
//   - Derived from java.lang.Exception
//   - Must be declared in the method's throw clause.
//   - Must be caught or rethrown by callers.
//   - Should be used when calling code can realistically recover from exception.
// - Unchecked Exceptions:
//   - Dervice from java.lang.RuntimeException
//   - Can optionally be declared in throw clause.
//   - Can optionally be handled or ignored.
//   - Should be used for programming errors, etc.
//
// Effective Java chapter 9 covers exceptions in depth.
//
public class Throwables {

	// Checked exceptions derive from Exception directly.
	class CheckedException extends Exception {
		public CheckedException() {
			super();
		}

		public CheckedException(String message) {
			super(message);
		}

		public CheckedException(String message, Throwable cause) {
			super(message, cause);
		}
	}

	// Unchecked exceptions derive from RuntimeException.
	class UncheckedException extends RuntimeException {
		public UncheckedException() {
			super();
		}

		public UncheckedException(String message) {
			super(message);
		}
	}

	// The other built-in type of Throwable is an Error, which is indicative of
	// a serious unrecoverable system error, such as OutOfMemoryError. It is
	// usually bad practice to extend Error, using a RuntimeException is almost
	// always preferable for application-level use.
	class UncheckedError extends Error {

	}

	// Finally, you can extend Throwable directly. This is also a bad practice,
	// use RuntimeException instead.
	class MyThrowable extends Throwable {

	}

	void throwChecked() throws CheckedException {
		Throwable cause = new UncheckedException("unchecked");
		throw new CheckedException("checked", cause);
	}

	void throwUnchecked() {
		throw new UncheckedException();
	}

	void throwDeclaredUnchecked() throws UncheckedException {
		throw new UncheckedException();
	}

	public static void main(String[] args) {
		Throwables test = new Throwables();

		// Since this method throws a checked exception, it must either be
		// caught or declared to be rethrown.
		// test.throwChecked(); error !

		try {
			test.throwChecked();
		} catch (final CheckedException e) {
			System.out.println("Caught checked exception");
			e.printStackTrace();
		}

		try {
			test.throwUnchecked();
		} catch (final Exception e) {
			System.out.println("Caught unchecked exception: " + e);
		}

		test.throwDeclaredUnchecked();
	}

}
