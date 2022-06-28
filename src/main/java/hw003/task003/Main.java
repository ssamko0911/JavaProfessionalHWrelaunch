package hw003.task003;

import java.io.FileInputStream;
import java.io.IOException;

/*
Задание 3
Необходимо создать строку с текстом (текст взять любой из интернета).
Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.
 */
public class Main {
    public static void main(String[] args) {
        String someTextFromInternet = null;
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\samko.s\\IdeaProjects\\JavaProfessionalHWrelaunch\\src\\main\\java\\hw003\\task003\\textfrominternet.txt")) {
            int count;
            while ((count = fileInputStream.read()) != -1) {
                someTextFromInternet = stringBuilder.append((char) count).toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert someTextFromInternet != null;
        if (someTextFromInternet.length() % 2 == 0) {
            System.out.printf("Substring One: %s, length %d.",
                    someTextFromInternet.substring(0, (someTextFromInternet.length() / 2)),
                    someTextFromInternet.substring(0, (someTextFromInternet.length() / 2)).length());
            System.out.printf("\nSubstring Two: %s, length %d.",
                    someTextFromInternet.substring((someTextFromInternet.length() / 2)),
                    someTextFromInternet.substring((someTextFromInternet.length() / 2)).length());
        } else {
            String stringToMakeRightSize = someTextFromInternet + " ";
            System.out.printf("Substring One: %s, length %d.",
                    stringToMakeRightSize.substring(0, (stringToMakeRightSize.length() / 2)),
                    stringToMakeRightSize.substring(0, (stringToMakeRightSize.length() / 2)).length());
            System.out.printf("\nSubstring Two: %s, length %d.",
                    stringToMakeRightSize.substring(stringToMakeRightSize.length() / 2),
                    stringToMakeRightSize.substring(stringToMakeRightSize.length() / 2).length());
        }
    }
}
