package hw006.task002;

import hw006.task002.models.Calculator;
import java.lang.reflect.Method;
/*
Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
Сделать полную документацию всех полей, методов, конструкторов класса используя аннотацию Documented,
либо же документационные комментарии.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> aClass = Calculator.class;
        Method method = aClass.getDeclaredMethod("calculate", int.class, int.class);
        CustomAnno annotation = method.getAnnotation(CustomAnno.class);
        Calculator calculator = new Calculator();
        calculator.calculate(annotation.parameterOne(), annotation.parameterTwo());
    }
}
