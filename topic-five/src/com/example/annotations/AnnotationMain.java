package com.example.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface SimpleAnnotation {

    // Default parameters
    String value() default "nila";

    // more  parameters
    int serialNumber() default 100;

    // more  parameters
    String[] text();
}

@Target(ElementType.TYPE) // where
@Retention(RetentionPolicy.SOURCE) // when
@interface AnnotationTargetingClass {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS) // Compile time
@interface AnnotationTargetingMethodOnly {}

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME) // Run time/ for jvm or application
@interface AnnotationTargetingParametersOnly {}

@SimpleAnnotation(
        value = "myname",
        serialNumber = 1234,
        text = {"1", "other", "example"})
@AnnotationTargetingClass
public class AnnotationMain {

    @SimpleAnnotation(text = {"2"})
    @AnnotationTargetingMethodOnly
    public static void main(
            @SimpleAnnotation(text = {"3"}) @AnnotationTargetingParametersOnly String[] args) {

        // Get runtime annotation from class level
        Annotation[] annotations = AnnotationMain.class.getAnnotations();

        for (Annotation a : annotations) {

            System.out.println("Annotation");
            System.out.println("Annotation - " + a.annotationType());
            if (a instanceof SimpleAnnotation) {

                // To access values from annotation
                SimpleAnnotation s = (SimpleAnnotation) a;
                System.out.println("Annotation value - " + s.value());
                System.out.println("Annotation value - " + s.text());
                System.out.println("Annotation value - " + s.serialNumber());
            }
        }

        // Get runtime annotation from method level
        Method[] methodsinTheClass = AnnotationMain.class.getMethods();
        for (Method a : methodsinTheClass) {
            Annotation[] annotationsFromMethods = a.getAnnotations();
            for (Annotation a1 : annotationsFromMethods) {

                System.out.println("Annotation");
                System.out.println("Annotation - " + a1.annotationType());
                if (a1 instanceof SimpleAnnotation) {

                    // To access values from annotation
                    SimpleAnnotation s = (SimpleAnnotation) a1;
                    System.out.println("Annotation value - " + s.value());
                    System.out.println("Annotation value - " + s.text());
                    System.out.println("Annotation value - " + s.serialNumber());
                }
            }
        }
    }
}
