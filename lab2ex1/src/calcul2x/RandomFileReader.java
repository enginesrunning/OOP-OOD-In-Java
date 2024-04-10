package calcul2x;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RandomFileReader {

    public static int getRandomNumberFromFile(String fileName) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                throw new NumberFormatException("File does not contain a valid integer.");
            }
        }
    }
}

// tratare exceptii
