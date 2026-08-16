package be.kdg.week3_reflection_annotation.annotations.custom_annotations.single_annotation;

public @interface MaxLength {
    int value() default 80;
}
