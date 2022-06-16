package hw002.task003;

import java.util.*;

/*
Задание 3
Минимальное из N чисел(использовать LinkedList):
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
 */
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input number of elements:");
        Collection<Integer> integers = fillList(in.nextInt());
        System.out.printf("Min value is %d.", getMin(integers));
        in.close();
    }

    public static Collection<Integer> fillList(int listSize) {
        Collection<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            System.out.println("Input an integer here:");
            integerList.add(in.nextInt());
        }
        return integerList;
    }

    public static int getMin(Collection<Integer> someCollection) {
        return Collections.min(someCollection);
    }
}
