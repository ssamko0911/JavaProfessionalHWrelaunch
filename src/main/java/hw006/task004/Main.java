package hw006.task004;

import java.lang.reflect.Method;
/*
Создать свою аннотацию, которая будет содержать параметры для метода, выполнить сложение 2-х чисел.
@Math(num1 = 100, num2 = 200)
public void mathSum(int num1, int num2)
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Main main = new Main();
        Class<?> aClass = Main.class;
        Method method = aClass.getDeclaredMethod("mathSum", int.class, int.class);
        Math annotation = method.getAnnotation(Math.class);
        main.mathSum(annotation.numberOne(), annotation.numberTwo());
    }

    @Math(numberOne = 100, numberTwo = 200)
    public void mathSum(int numberOne, int numberTwo) {
        System.out.printf("Sum is %d.", numberOne + numberTwo);
    }
}
