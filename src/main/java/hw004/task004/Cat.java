package hw004.task004;

import java.lang.reflect.Field;

/*
Задание 4
Создайте 2 класса, Animal и Cat. В классе Animal инициализируйте 3 поля различных модификаторов.
В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое
каждого из полей.
 */
public class Cat {
    // мог неверно понять условие задачи, готов доработать.
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Animal animal = new Animal();
        Class<Animal> animalClass = Animal.class;
        Field[] fields = animalClass.getDeclaredFields();
        drawLines();
        System.out.println("Object data before changes:");
        drawLines();
        for (Field item : fields) {
            item.setAccessible(true);
            System.out.printf("%-10s | %-5s\n", item.get(animal), item.getType().getSimpleName());
        }

        Field changeName = animalClass.getDeclaredField("name");
        changeName.setAccessible(true);
        changeName.set(animal, "Harold");
        Field changeAge = animalClass.getDeclaredField("age");
        changeAge.setAccessible(true);
        changeAge.set(animal, 1);
        Field changeisTale = animalClass.getDeclaredField("isTale");
        changeisTale.setAccessible(true);
        changeisTale.set(animal, false);
        drawLines();
        System.out.println("Object data after changes:");
        drawLines();
        System.out.println(animal);
        drawLines();
    }

    public static void drawLines() {
        System.out.println("-".repeat(50));
    }
}
