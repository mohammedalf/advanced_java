package be.kdg.week3_reflection_annotation.annotations.custom_annotations.full_annotation;

public @interface Since {
    int major();
    int minor() default 0;
    String[] authors();
    String[] reviewers();
}
