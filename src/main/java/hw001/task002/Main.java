package hw001.task002;
/*
Задание 2
Вывод на экран элементов List: Создать список, заполнить
его на 10 элементов и вывести на экран содержимое используя iterator.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static final int LENGTH_OF_LIST = 10;

    public static void main(String[] args) {
        Collection<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < LENGTH_OF_LIST; i++) {
            integerList.add((int) ((Math.random() * 89) + 10));
        }
        Iterator<Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()) {
            Integer element = integerIterator.next();
            System.out.print(element + " | ");
        }
    }
}
