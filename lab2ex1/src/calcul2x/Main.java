package calcul2x;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "random.txt";
        int x;

        try {
            x = RandomFileReader.getRandomNumberFromFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Using x = 1.");
            x = 1;
        } catch (NumberFormatException e) {
            System.out.println("Error: File content is not a valid integer. Using x = 1.");
            x = 1;
        }

        int result = 2 * x;
        System.out.println("Result: " + result);
    }
}

