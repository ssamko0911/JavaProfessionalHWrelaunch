package hw003.task004;
/*
Задание 4
Создайте в package текстовый файл и клас, внесите в файл некий текст.
Выведите на экран содержимое файла.
 */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String taskFile = "C:\\Users\\samko.s\\IdeaProjects\\JavaProfessionalHWrelaunch\\src\\main\\java\\hw003\\task004\\task004.txt";
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(taskFile)))) {
            dataOutputStream.writeUTF(inputText());
            System.out.println("File is successfully written.");
        } catch (IOException exception) {
            System.err.println("Something went wrong.");
            exception.printStackTrace();
        }
        drawLines();
        System.out.println("Reading data from file:");
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\samko.s\\IdeaProjects\\JavaProfessionalHWrelaunch\\src\\main\\java\\hw003\\task004\\task004.txt")) {
            int symbol;
            while ((symbol = fileInputStream.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (IOException exception) {
            System.err.println("Something went wrong.");
            exception.printStackTrace();
        }
    }

    public static String inputText() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input text you'd like to add to the file:");
        try {
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Wrong input data. This is default string to the file.";
    }

    public static void drawLines() {
        System.out.println("-".repeat(50));
    }
}
