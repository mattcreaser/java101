package com.goinstant;

// Covariant return types are a feature of java method overrides added in 1.5 
// that allow the return type in an overridden method to be a subclass of the
// original return type: to "narrow" the type.
//
// This gives greater flexibility/type safety for overridden methods.
public class CovariantReturns {

	static abstract class Shape {
		public abstract Shape makeCopy();

		public void draw() {
			// ...
		}
	}

	static class Square extends Shape {

		public Square(int x, int y) {
			this.x = x;
			this.y = y;
		}

		// We can override makeCopy even though we change the return type.
		// This lets consumers who know about Squares to make a copy of
		// a Square with full type safety, while consumers who only know
		// about Shapes can also make a copy for their purposes.
		@Override
		public Square makeCopy() {
			return new Square(x, y);
		}

		private int x;
		private int y;
	}

}
