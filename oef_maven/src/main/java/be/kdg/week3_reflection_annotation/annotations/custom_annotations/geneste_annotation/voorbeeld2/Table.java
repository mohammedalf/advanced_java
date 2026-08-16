package be.kdg.week3_reflection_annotation.annotations.custom_annotations.geneste_annotation.voorbeeld2;

import be.kdg.week3_reflection_annotation.annotations.custom_annotations.geneste_annotation.voorbeeld1.Column;

public @interface Table {
    //array van geneste annotaties
    Column[] value();
}
