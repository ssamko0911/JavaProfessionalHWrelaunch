package hw009.task002;

import java.util.ArrayList;
import java.util.List;

/*
Создать список и заполнить рандомными числами 10 ячеек,
нужно вывести сумму квадратов всех элемента списка.
Мы используем метод map() для возведения в квадрат каждого элемента,
а потом применяем метод reduce() для свертки всех элементов в одно число.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillList(list);
        System.out.printf("List to check: %s", list);
        System.out.printf("\nSum of squared elements of list is %s",
                list
                        .stream()
                        .map((x) -> x * x)
                        .reduce(Integer::sum));
    }

    private static int setRandom() {
        return (int) (Math.random() * (9 - 1) + 1);
    }

    private static void fillList(List<Integer> someList) {
        for (int i = 0; i < 10; i++) {
            someList.add(setRandom());
        }
    }
}
