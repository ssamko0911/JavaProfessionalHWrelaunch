package hw002.task005;
/*
Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
1. Создать список строк.
2. Ввести строки с клавиатуры и добавить их в список.
3. Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
4. Вывести строки на экран, каждую с новой строки.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        while (true) {
            System.out.println("Input a string here:");
            String stringToAdd = in.nextLine();
            if (stringToAdd.equalsIgnoreCase("end")) {
                break;
            }
            stringCollection.add(stringToAdd);
        }
        System.out.println("<----------------RESULT----------------->");
        for (String item : stringCollection) {
            System.out.println(item);
        }
        in.close();
    }
}
