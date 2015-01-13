package com.goinstant;

// Enumerations can be top-level types like classes.
public class Enumerations {

	// Your basic enum just lists one or more constant.
	public enum BasicEnum {
		// The fields should be all uppercase.
		FOO, BAR
	}

	// Enumerations can have members and methods, just like a class.
	// Unlike a class, you shouldn't modifying state inside an enum; you're
	// allowed to, but that's a major code smell.
	public enum AdvancedEnum {
		A("apple"), B("baby"); // Need a semi-colon to identify the end of the
								// value list.

		private String value;

		private AdvancedEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return value;
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Enumerations must be initialized to an existing value or null.
		BasicEnum a = BasicEnum.FOO;
		BasicEnum b = BasicEnum.BAR;
		BasicEnum c = null;
		// Enumerations d = Enumerations.BAZ; // error!

		// You can get the name of the enum.
		System.out.println(BasicEnum.FOO.name());

		// And it's ordinal value (e.g. it's position in the value list).
		System.out.println(BasicEnum.BAR.ordinal());

		// You can get all of the values.
		for (AdvancedEnum value : AdvancedEnum.values()) {
			System.out.println(value);
		}

		// You can switch on the enum.
		switch (a) {
		case FOO:
			System.out.println("It's foo");
			break;
		case BAR:
			System.out.println("It's bar");
			break;
		}

		// And basically treat it like a primitive.
		System.out.println(c == BasicEnum.BAR);
	}

}