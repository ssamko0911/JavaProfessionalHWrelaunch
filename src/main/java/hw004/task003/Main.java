package hw004.task003;

/*
Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы.
Под средством рефлексии получите всю информацию о полях, методах, конструкторах,
а также модификаторах доступа.
 */

import hw004.task003.models.Human;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Class<Human> humanClass = Human.class;
        System.out.println("Class fields information:".toUpperCase(Locale.ROOT));
        Field[] humanFields = humanClass.getDeclaredFields();
        drawLines();
        setTitle();
        for (Field item : humanFields) {
            item.setAccessible(true);
            System.out.printf("%-15s %-18s %-10s\n",
                    item.getName(), Modifier.toString(item.getModifiers()), item.get(new Human()));
        }
        drawLines();
        System.out.println("Class Constructors information:".toUpperCase(Locale.ROOT));
        Constructor<?>[] constructors = humanClass.getConstructors();
        for (Constructor<?> item : constructors) {
            Class<?>[] parameterTypes = item.getParameterTypes();
            System.out.println("Constructor: " + item.getName());
            System.out.println("Parameter types: ");
            for (Class<?> element : parameterTypes) {
                System.out.print(element.getSimpleName() + " | ");
            }
            System.out.println();
        }

        drawLines();
        System.out.println("Class Methods information:".toUpperCase(Locale.ROOT));
        Method[] methods = humanClass.getMethods();
        for (Method item : methods) {
            System.out.printf("\nMethod's name: %s", item.getName());
            System.out.printf("\nMethod's return type: %s", item.getReturnType().getSimpleName());
            System.out.printf("\nParameter's type: %s", item.getReturnType().getSimpleName());
            Class<?>[] parameterTypes = item.getParameterTypes();
            for (Class<?> element : parameterTypes) {
                System.out.print(element.getSimpleName() + " | ");
            }
            System.out.println();
        }
    }

    public static void drawLines() {
        System.out.println("-".repeat(50));
    }

    public static void setTitle() {
        System.out.printf("%-15s %-18s %-10s\n", "FIELD's NAME", "ACCESS MODIFIER", "FIELD's VALUE");
    }
}
