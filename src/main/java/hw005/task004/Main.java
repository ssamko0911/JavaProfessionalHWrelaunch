package hw005.task004;
/*
Задание 4.
Создайте поток-демон и выведите про него как можно больше информации.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // суть задания не ясна, готов переделывать;
        Thread thread = new Thread();
        thread.setDaemon(true);
        Field[] fields = thread.getClass().getDeclaredFields();
        System.out.printf("%-35s %-30s %-10s\n", "FIELD's NAME", "ACCESS MODIFIER", "FIELD's TYPE");
        for (Field item : fields) {
            System.out.printf("%-35s %-30s %-10s\n",
                    item.getName(), Modifier.toString(item.getModifiers()), item.getType());
        }
        System.out.println();
        System.out.println("Constructors:".toUpperCase(Locale.ROOT));
        Constructor<?>[] constructor = thread.getClass().getDeclaredConstructors();
        for (Constructor<?> item : constructor) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("Methods:".toUpperCase(Locale.ROOT));
        Method[] methods = thread.getClass().getMethods();
        for (Method item : methods) {
            System.out.println(item);
        }
    }
}
