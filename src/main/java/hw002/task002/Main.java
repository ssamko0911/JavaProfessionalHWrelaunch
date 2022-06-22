package hw002.task002;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/*
Задание 2
Используя коллекцию удвойте слово:
1. Введите с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
 */
public class Main {
    public static final int LIMIT_OF_ELEMENTS_IN_COLLECTION = 5;
// ниже закомментирован ещё один вариант решения без создания нового объекта.
    public static void main(String[] args) {
        Collection<String> stringCollection = getStrings();
        for (String item : stringCollection) {
            System.out.println(item);
        }
        Collection<String> stringCollectionDouble = doubleValues(stringCollection);

        System.out.println("<----------------------RESULT---------------------->");
        for (String item : stringCollectionDouble) {
            System.out.println(item);
        }

//        List<String> list = new ArrayList<>();
//        list.add("One");
//        list.add("Two");
//        List<String> stringListDouble = doubleValuesOptionTwo(list);
//        System.out.println("<----------------------RESULT---------------------->");
//        for (String item : stringListDouble) {
//            System.out.println(item);
//        }
    }

    private static Collection<String> getStrings() {
        Collection<String> strings = new ArrayList<>();
        for (int i = 0; i < LIMIT_OF_ELEMENTS_IN_COLLECTION; i++) {
            System.out.println("Input any string here:");
            strings.add(new Scanner(System.in).nextLine());
        }
        return strings;
    }

    private static Collection<String> doubleValues(Collection<String> someCollection) {
        Collection<String> stringsDoubled = new ArrayList<>();
        for (String item : someCollection) {
            stringsDoubled.add(item);
            stringsDoubled.add(item);
        }
        return stringsDoubled;
    }

//    private static List<String> doubleValuesOptionTwo(List<String> someCollection) {
//        for (int i = 0; i < someCollection.size(); i++) {
//            someCollection.add(i + 1, someCollection.get(i));
//            i++;
//        }
//        return someCollection;
//    }

}
