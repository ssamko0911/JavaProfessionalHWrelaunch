package hw001.task003;

import hw001.task003.models.Animal;
import java.util.Arrays;
import java.util.Locale;

/*
Задание 3
В папке с примерами, ex_004_comparable. Дописать логику, чтобы метод compareTo()
осуществил поиск по скорости (если же скорость у 2-х объектов равна, то ищем по цене)
 -> цене - > весу -> цвету животного.
 */
public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    // сортировка по первым двум полям была в примере к заданию, она реализована.
    public static void main(String[] args) {
        Animal[] animalsOne =
                {(new Animal("Dash hound", 2, 5, 5)),
                        (new Animal("Canary bird", 2, 5, 5)),
                        (new Animal("ARA", 2, 5, 5))};
        System.out.println(ANSI_RED + "Initial data".toUpperCase(Locale.ROOT) + ANSI_RESET);
        setTitle();
        printElements(animalsOne);
        System.out.println();
        Arrays.sort(animalsOne);
        System.out.println(ANSI_RED + "Sorting by last String field (Breed)".toUpperCase(Locale.ROOT) + ANSI_RESET);
        setTitle();
        printElements(animalsOne);
        System.out.println("----------------------------------------------------------");
        Animal[] animalsTwo =
                {(new Animal("Dash hound", 4, 5, 5)),
                        (new Animal("Canary bird", 1, 5, 5)),
                        (new Animal("ARA", 2, 5, 5))};

        Arrays.sort(animalsTwo);
        System.out.println(ANSI_RED + "Sorting by third int field (Weight)".toUpperCase(Locale.ROOT) + ANSI_RESET);
        setTitle();
        printElements(animalsTwo);
    }

    public static void setTitle() {
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n", "------", "BREED", "WEIGHT", "SPEED", "PRICE");
    }

    public static void printElements(Animal[] someArray) {
        for (Animal element : someArray) {
            System.out.println(element);
        }
    }
}
