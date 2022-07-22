package hw009.task003;

import hw009.task003.models.Book;

@FunctionalInterface
public interface Gettable {
    int getAmountOfPages (Book book);
}
