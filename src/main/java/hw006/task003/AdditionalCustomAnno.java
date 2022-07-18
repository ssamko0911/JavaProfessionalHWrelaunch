package hw006.task003;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AdditionalCustomAnno {
    String someString() default "Without Inheritance";
}
