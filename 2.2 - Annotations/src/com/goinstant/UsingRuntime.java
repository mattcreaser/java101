package com.goinstant;

import java.lang.reflect.Method;

public class UsingRuntime {

	static class Test {
		@Runtime
		public void someMethod() {
			System.out.println("bad!");
		}

		@Runtime(name = "customName")
		public void someOtherMethod() {
			System.out.println("good!");
		}

		public void unAnnotatedMethod() {
			System.out.println("bad!");
		}
	}

	public static void main(String[] args) throws Exception {

		Test test = new Test();

		Method[] methods = test.getClass().getMethods();
		for (Method method : methods) {
			if (!method.isAnnotationPresent(Runtime.class)) {
				continue;
			}

			Runtime annotation = method.getAnnotation(Runtime.class);
			if (annotation.name().equals("customName")) {
				method.invoke(test);
			}

		}
	}
}
