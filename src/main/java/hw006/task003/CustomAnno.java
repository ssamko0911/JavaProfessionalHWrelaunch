package hw006.task003;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface CustomAnno {
    String someString() default "Inherited";
}
