package com.goinstant;

import java.util.List;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

@SupportedAnnotationTypes("com.goinstant.Source")
public class SourceProcessor extends AbstractProcessor {

	public SourceProcessor() {
		super();
	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
			RoundEnvironment roundEnv) {

		if (roundEnv.processingOver()) {
			return true;
		}

		Set<? extends Element> elements = roundEnv
				.getElementsAnnotatedWith(Source.class);

		for (Element element : elements) {
			if (element.getKind() != ElementKind.CLASS) {
				processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
						"@Source must be applied to a class");
				continue;
			}

			Source annotation = element.getAnnotation(Source.class);
			String methodName = annotation.methodName();

			boolean found = false;

			List<? extends Element> subElements = element.getEnclosedElements();
			for (Element subElement : subElements) {
				if (subElement.getKind() == ElementKind.METHOD
						&& subElement.getSimpleName().equals(methodName)) {
					found = true;
					break;
				}
			}

			if (!found) {
				processingEnv.getMessager().printMessage(
						Diagnostic.Kind.ERROR,
						element.getSimpleName() + " is missing method named "
								+ methodName);
			}

		}

		return true;
	}
}
