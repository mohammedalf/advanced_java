package be.kdg.week3_reflection_annotation.annotations.custom_annotations.meta_annotations;

import java.lang.annotation.*;



@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Documented
@Inherited
public @interface MyAnno {
}


//@Retention
//•SOURCE: in source, maar de compiler zet de annotatie niet
//in de bytecode
//•CLASS (default): zijn beschikbaar in de class file, maar
//worden genegeerd door de JVM
//•RUNTIME: in source, bytecode en runtime code

//Target
//•Op welke elementen kan MyAnno gebruikt worden?
//(Default: all)
//@Documented
//• Zal MyAnno vermeld worden in de javadoc van de klassen
//waarin ze gebruikt wordt? (default: no)
//@Inherited
//• Overgeërfd of niet? (default: no)