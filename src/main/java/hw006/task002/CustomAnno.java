package hw006.task002;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnno {
    int parameterOne();

    int parameterTwo();
}
