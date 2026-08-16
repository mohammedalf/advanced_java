package be.kdg.week3_reflection_annotation.annotations.custom_annotations.geneste_annotation.voorbeeld2;

import be.kdg.week3_reflection_annotation.annotations.custom_annotations.geneste_annotation.voorbeeld1.Column;
import be.kdg.week3_reflection_annotation.annotations.custom_annotations.single_annotation.MaxLength;

@Table({
        @Column(name = "MERK", check = @MaxLength(40)),
        @Column(name = "BESCHRIJVING", check = @MaxLength(120))
}
)
public class Product {
    private String merk;
    private String beschrijving;
}
