package be.kdg.week3_reflection_annotation.annotations.custom_annotations.geneste_annotation.voorbeeld1;

import be.kdg.week3_reflection_annotation.annotations.custom_annotations.single_annotation.MaxLength;

public @interface Column {
    String name();

    //dit is een andere zelfgemaakte annotatie
    MaxLength check();
}
