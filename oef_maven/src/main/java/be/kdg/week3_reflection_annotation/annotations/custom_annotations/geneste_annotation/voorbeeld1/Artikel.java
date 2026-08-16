package be.kdg.week3_reflection_annotation.annotations.custom_annotations.geneste_annotation.voorbeeld1;

import be.kdg.week3_reflection_annotation.annotations.custom_annotations.single_annotation.MaxLength;

public class Artikel {
    @ Column(name = "COMM", check = @MaxLength(120))
    String commentaar ;
}
