package lab3ex1;

//122

import java.util.Scanner;

public class InputReader {

    public static Integer readInteger() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (or leave blank to quit): ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            return null;
        }

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter an integer.");
            throw e; //
        }
    }
}

