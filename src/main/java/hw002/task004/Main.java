package hw002.task004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Задание 4
Программа определяет, какая семья (фамилия) живёт в городе:
Пример ввода:
·Москва
·Ивановы
·Киев
·Петровы
·Лондон
·Абрамовичи

·Лондон
Пример вывода:
·Абрамовичи
 */
public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, String> mapCitiesAndFamilies = new HashMap<>();
        System.out.println("Input size of map:");
        fillMap(Integer.parseInt(in.readLine()), mapCitiesAndFamilies);
        System.out.println("Input city to get family from there:");
        System.out.printf("%s family lives there.", getValueByKey(in.readLine(), mapCitiesAndFamilies));
        in.close();
    }

    public static void fillMap(int mapSize, Map<String, String> someMap) {
        for (int i = 0; i < mapSize; i++) {
            try {
                System.out.println("Input city - press Enter:");
                String city = in.readLine();
                System.out.println("Input family name - press Enter:");
                String family = in.readLine();
                someMap.put(city, family);
            } catch (IOException exception) {
                System.out.println("It's not allowed to put here inappropriate data");
                exception.printStackTrace();
            }
        }
    }

    public static String getValueByKey(String key, Map<String, String> someMap) {
        return someMap.get(key);
    }
}
