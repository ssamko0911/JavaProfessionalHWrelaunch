package hw009.task003;

/*
Задание 3.
Создать класс Book, сделать 3 поля и соответствующие методы.
Необходимо реализовать замыкание анонимного класса и лямбда-выражения.
 */

import hw009.task003.models.Book;

public class Main {
    public static void main(String[] args) {
        // не ясна до конца задача, готов исправлять, нужны детали;
        Book book = new Book("Thomas The Tank Engine", 88, "Wilbert Awdry");
        Gettable getIt = (x) -> {
            return book.getAmountOfPages();
        };
        System.out.printf("The amount of pages is %s", getIt.getAmountOfPages(book));
    }
}
