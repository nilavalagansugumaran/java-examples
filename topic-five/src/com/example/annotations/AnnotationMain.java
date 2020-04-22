package com.example.annotations;

import java.lang.annotation.*;

@SimpleAnnotation
@AnnotationTargetingClass
public class AnnotationMain {

    @SimpleAnnotation
    @AnnotationTargetingMethodOnly
    public static void main(@SimpleAnnotation @AnnotationTargetingParametersOnly String[] args) {

       Annotation[] annotations =  AnnotationMain.class.getAnnotations();
        System.out.println("Annotations - ");
       for(Annotation a : annotations) {

           System.out.println("Annotation");
           System.out.println("Annotation - " + a.annotationType());
       }
    }
}

@interface SimpleAnnotation {

}

@Target(ElementType.TYPE) // where
@Retention(RetentionPolicy.SOURCE) // when
@interface AnnotationTargetingClass {

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS) // Compile time
@interface AnnotationTargetingMethodOnly {

}

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME) // Run time/ for jvm or application
@interface AnnotationTargetingParametersOnly {

}

