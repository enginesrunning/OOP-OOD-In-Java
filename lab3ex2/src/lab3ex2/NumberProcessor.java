package lab3ex2;

//124

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumberProcessor {

  public static void main(String[] args) {
    double positiveSum = 0;
    double negativeSum = 0;
    
    Path filePath = Paths.get("data.txt");  

    try {
      File dataFile = filePath.toFile();
      Scanner scanner = new Scanner(dataFile);

      while (scanner.hasNext()) {
        if (scanner.hasNextDouble()) {
          double number = scanner.nextDouble();
          if (number > 0) {
            positiveSum += number;
          } else if (number < 0) {
            negativeSum += number;
          }
        } else {
          scanner.next();
        }
      }

      scanner.close();

      System.out.println("Sum of positive numbers: " + positiveSum);
      System.out.println("Sum of negative numbers: " + negativeSum);
//parse integ
    } catch (FileNotFoundException e) {
      System.out.println("Error: File not found!");
    }
  }
}
