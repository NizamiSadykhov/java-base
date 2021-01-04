package lesson6;

import java.io.FileInputStream;
import java.io.IOException;

public class Lesson6 {
    static final String CAT_FILE_NAME = "cat.txt";
    static final String DOG_FILE_NAME = "dog.txt";

    public static void main(String[] args) {
        String result = combineTextFromTwoFiles(CAT_FILE_NAME, DOG_FILE_NAME);
        System.out.println(result);
    }

    public static String combineTextFromTwoFiles(String fileName1, String fileName2) {
        return readFile(fileName1) + readFile(fileName2);
    }

    public static String readFile(String fileName) {
        StringBuilder fileText = new StringBuilder();
        try(FileInputStream fis = new FileInputStream(fileName)) {
            int inputBox;
            while ((inputBox = fis.read()) != -1 ){
                fileText.append((char) inputBox);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileText.toString();
    }

    public static boolean haveThisWordInFile(String word, String fileName){
        String fileText = readFile(fileName);
        return fileText.matches(word);
    }
}
