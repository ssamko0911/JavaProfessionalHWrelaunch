package hw005.task002;
/*
Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла
бы заменить все предлоги на слово «Java».
 */
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        Оригинальный текст в файле был:
        Whether you are working on a new cutting edge app or simply ramping up on new technology, Java documentation has all the information you need to make your project a smashing success. Use the rich set of code samples, tutorials, developer guides, API documentation, and more to quickly develop your prototype and scale it up to a real world application.
        Предлоги определил самостоятельно, т.к. задание достаточно не точное.
         */
        System.out.println("Original text from file is:");
        String file = "C:\\Users\\samko.s\\IdeaProjects\\JavaProfessionalHWrelaunch\\src\\main\\java\\hw005\\task002\\sometext.txt";
        Path path = Paths.get(file);
        String textFromFile = String.valueOf(Files.readAllLines(path));
        System.out.println(textFromFile);
        Pattern pattern = Pattern.compile("(?<!\\S)(?:a|the|at|on|in|under|and|or)(?!\\S)");
        Matcher matcher = pattern.matcher(textFromFile);
        System.out.println("Substitution due to task is:");
        System.out.println(matcher.replaceAll("JAVA"));
        System.out.println();
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(matcher.replaceAll("JAVA"));
            writer.flush();
        }
    }
}
