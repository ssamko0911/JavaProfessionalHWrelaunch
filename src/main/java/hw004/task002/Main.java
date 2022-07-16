package hw004.task002;

import hw004.task002.models.Cat;
import hw004.task002.models.Dog;
import hw004.task002.models.Fish;

import java.lang.reflect.*;
import java.util.Scanner;

/*
Задание 2
Напишите программу, которая будет выводить
всю информацию о классе, пользователь сам выбирает, какой именно класс интересует.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose Class to get information:\n1 - Cat\n2 - Dog\n3 - Fish");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1 -> getInfo(Cat.class);
            case 2 -> getInfo(Dog.class);
            case 3 -> getInfo(Fish.class);
            default -> System.err.println("Wrong choice, program has stopped");
        }
    }

    public static void getInfo(Class<?> someClass) {
        getFieldsInfo(someClass);
        getConstructorsInfo(someClass);
        getMethodsInfo(someClass);
    }

    public static void getFieldsInfo(Class<?> someClass) {
        drawLines();
        Field[] fields = someClass.getDeclaredFields();
        setTitle();
        for (Field item : fields) {
            item.setAccessible(true);
            System.out.printf("%-15s %-18s %-10s\n",
                    item.getName(), Modifier.toString(item.getModifiers()), item.getType());
        }
        drawLines();
    }

    public static void getConstructorsInfo(Class<?> someClass) {
        Constructor<?>[] constructors = someClass.getConstructors();
        for (Constructor<?> item : constructors) {
            System.out.printf("Constructor information: %s.\n", item.getName());
        }
        drawLines();
    }

    public static void getMethodsInfo(Class<?> someClass) {
        Method[] methods = someClass.getMethods();
        for (Method item : methods) {
            System.out.printf("Method information: name - %s, return type - %s.\n", item.getName(), item.getReturnType());
        }
        drawLines();
    }

    public static void setTitle() {
        System.out.printf("%-15s %-18s %-10s\n", "FIELD's NAME", "ACCESS MODIFIER", "FIELD's TYPE");
    }

    public static void drawLines() {
        System.out.println("-".repeat(80));
    }
}
