package com.goinstant;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define this annotation as a RUNTIME annotation: it will be retained by the JVM 
// and can be accessed via Reflection. Other possibilities are:
// SOURCE - discarded after compiling.
// CLASS  - recorded in .class file but not available via reflection (default).
@Retention(RetentionPolicy.RUNTIME)
// What type of elements can this annotation be applied to? Others are:
// ANNOTATION_TYPE (other annotations, e.g. @Target itself) , CONSTRUCTOR,
// FIELD, LOCAL_VARIABLE, PACKAGE, PARAMETER, TYPE.
@Target(ElementType.METHOD)
// Mark this annotation as documented so that it'll show up in JavaDocs.
@Documented
// Mark this annotation as inherited so that the overridden versions of methods
// will get the annotation.
@Inherited
@interface Runtime {
	public String name() default "DefaultName";
}
