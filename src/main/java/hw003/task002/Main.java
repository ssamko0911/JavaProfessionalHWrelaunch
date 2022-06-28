package hw003.task002;
/*
Задание 2
Создайте файл, запишите в него произвольные данные и закройте файл.
Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.
 */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String file = "C:\\Users\\samko.s\\IdeaProjects\\JavaProfessionalHWrelaunch\\src\\main\\java\\hw003\\task002\\somefile.txt";
        try {
            DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            outputStream.writeUTF("Implementation comments are mean for commenting out code or for comments about the\n" +
                    "particular implementation.");
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream inputStream = new FileInputStream(file);
            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
